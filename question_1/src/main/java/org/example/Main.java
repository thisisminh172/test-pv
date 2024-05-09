package org.example;

import org.example.entity.ExecutionRecordEntity;
import org.example.service.ExecutionRecordService;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ExecutionRecordService service = new ExecutionRecordService();

        int size = 0;
        try {
            size = service.getAllRecords().size() + 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ExecutionRecordEntity entity = new ExecutionRecordEntity();
        entity.setServiceName("service name" + size);
        entity.setMsgid("message id " + size);
        entity.setRequestPayload("request payload "+ size);
        entity.setRequest_timestamp(new Timestamp(System.currentTimeMillis()));

        try {
            service.saveRecord(entity);
        } catch (Exception e) {
            System.out.println(e);
        }
        List<ExecutionRecordEntity> entityList = new ArrayList<>();
        try {
            entityList = service.getAllRecords();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if (entityList.size() != 0) {
            for (ExecutionRecordEntity e : entityList) {
                System.out.println("serno: " + e.getSerno()
                        + " - serviceName: " + e.getServiceName()
                        + " - messageId" + e.getMsgid()
                        + " - requestPayload" + e.getRequestPayload()
                        + " - requestTimestamp" + e.getRequest_timestamp()
                );
            }
        }

    }


}