package org.example.entity;

import java.sql.Timestamp;
import java.time.LocalTime;

public class ExecutionRecordEntity {
    private int serno;
    private String serviceName;
    private String msgid;
    private String requestPayload;
    private Timestamp request_timestamp;

    public ExecutionRecordEntity() {
    }

    public ExecutionRecordEntity(int serno, String serviceName, String msgid, String requestPayload, Timestamp request_timestamp) {
        this.serno = serno;
        this.serviceName = serviceName;
        this.msgid = msgid;
        this.requestPayload = requestPayload;
        this.request_timestamp = request_timestamp;
    }

    public int getSerno() {
        return serno;
    }

    public void setSerno(int serno) {
        this.serno = serno;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    public String getRequestPayload() {
        return requestPayload;
    }

    public void setRequestPayload(String requestPayload) {
        this.requestPayload = requestPayload;
    }

    public Timestamp getRequest_timestamp() {
        return request_timestamp;
    }

    public void setRequest_timestamp(Timestamp request_timestamp) {
        this.request_timestamp = request_timestamp;
    }
}
