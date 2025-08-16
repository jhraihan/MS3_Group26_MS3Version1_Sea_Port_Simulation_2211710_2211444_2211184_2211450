package com.example.sea_port_simulation.jahid_2211710;

import java.time.LocalDate;

public class AuditLog {
    private int logID,userID,entityID;
    private String userrole,actionType,status,search,entityType;
    private LocalDate startDate,endDate;

    public AuditLog(int logID, int userID, int entityID, String userrole, String actionType, String status, String search, String entityType, LocalDate startDate, LocalDate endDate) {
        this.logID = logID;
        this.userID = userID;
        this.entityID = entityID;
        this.userrole = userrole;
        this.actionType = actionType;
        this.status = status;
        this.search = search;
        this.entityType = entityType;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getLogID() {
        return logID;
    }

    public void setLogID(int logID) {
        this.logID = logID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getEntityID() {
        return entityID;
    }

    public void setEntityID(int entityID) {
        this.entityID = entityID;
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "AuditLog{" +
                "logID=" + logID +
                ", userID=" + userID +
                ", entityID=" + entityID +
                ", userrole='" + userrole + '\'' +
                ", actionType='" + actionType + '\'' +
                ", status='" + status + '\'' +
                ", search='" + search + '\'' +
                ", entityType='" + entityType + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
