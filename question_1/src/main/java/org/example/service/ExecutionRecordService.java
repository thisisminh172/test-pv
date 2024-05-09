package org.example.service;

import org.example.dao.ExecutionRecordDAO;
import org.example.entity.ExecutionRecordEntity;

import java.sql.*;
import java.util.List;

public class ExecutionRecordService {

    private ExecutionRecordDAO executionRecordDAO;

    public ExecutionRecordService() {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "admin";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            this.executionRecordDAO = new ExecutionRecordDAO(connection);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<ExecutionRecordEntity> getAllRecords() throws SQLException {
        return executionRecordDAO.getAllRecords();
    }

    public void saveRecord(ExecutionRecordEntity entity) throws SQLException {
        executionRecordDAO.saveRecord(entity);
    }
}
