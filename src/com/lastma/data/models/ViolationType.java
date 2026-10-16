package com.lastma.data.models;

public enum ViolationType {
    OVERSPEEDING(3_000),
    DUI(12_000),
    EXPIRED_PAPERS(14_000),
    TRAFFIC_LIGHT_OFFENCE(15_000),
    ONE_WAY(14_000),
    ;

    ViolationType(int paymentAmount){

    }
}
