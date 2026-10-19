package com.lastma.data.models;

import java.math.BigDecimal;

public class Offence {
    private String id;
    private String code;
    private String name;
    private String description;
    private int penalPoints;
    private BigDecimal firstOffenceFine;
    private String additionalPenaltyDescription;
    private boolean active;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPenalPoints() {
        return penalPoints;
    }

    public void setPenalPoints(int penalPoints) {
        this.penalPoints = penalPoints;
    }

    public BigDecimal getFirstOffenceFine() {
        return firstOffenceFine;
    }

    public void setFirstOffenceFine(BigDecimal firstOffenceFine) {
        this.firstOffenceFine = firstOffenceFine;
    }

    public String getAdditionalPenaltyDescription() {
        return additionalPenaltyDescription;
    }

    public void setAdditionalPenaltyDescription(String additionalPenaltyDescription) {
        this.additionalPenaltyDescription = additionalPenaltyDescription;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
