package com.lastma.data.models;

import java.math.BigDecimal;

public class Ticket<localDateTime> {
    private String id;
    private String ticketNumber;
    private String vehicleId;
    private String officerId;
    private String incidentDatetime;
    private String location;
    private String description;
    private BigDecimal assessedFine;
    private String status;
    private localDateTime issuedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getOfficerId() {
        return officerId;
    }

    public void setOfficerId(String officerId) {
        this.officerId = officerId;
    }

    public String getIncidentDatetime() {
        return incidentDatetime;
    }

    public void setIncidentDatetime(String incidentDatetime) {
        this.incidentDatetime = incidentDatetime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAssessedFine() {
        return assessedFine;
    }

    public void setAssessedFine(BigDecimal assessedFine) {
        this.assessedFine = assessedFine;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public localDateTime getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(localDateTime issuedAt) {
        this.issuedAt = issuedAt;
    }
}