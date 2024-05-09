package org.example.dao;

import org.example.entity.ExecutionRecordEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExecutionRecordDAO {
    private Connection connection;

    public ExecutionRecordDAO(Connection connection) {
        this.connection = connection;
    }

    public List<ExecutionRecordEntity> getAllRecords() throws SQLException {
        List<ExecutionRecordEntity> executionRecordEntities = new ArrayList<>();
        String query = "select * from execution_record";
        try {
            PreparedStatement stmt= connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ExecutionRecordEntity entity = new ExecutionRecordEntity();
                entity.setSerno(rs.getInt("serno"));
                entity.setServiceName(rs.getString("serviceName"));
                entity.setMsgid(rs.getString("msgid"));
                entity.setRequestPayload(rs.getString("requestPayload"));
                entity.setRequest_timestamp(rs.getTimestamp("request_timestamp"));
                executionRecordEntities.add(entity);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return executionRecordEntities;
    }

    public void saveRecord(ExecutionRecordEntity entity) throws SQLException {
        String query = "insert into execution_record (serviceName, msgid, requestPayload, request_timestamp) "
                + "values (?, ?, ?, ?)";
        try {
            PreparedStatement statement= connection.prepareStatement(query);
            statement.setString(1, entity.getServiceName());
            statement.setString(2, entity.getMsgid());
            statement.setString(3, entity.getRequestPayload());
            statement.setTimestamp(4, entity.getRequest_timestamp());

            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
