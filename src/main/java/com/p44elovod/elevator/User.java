package com.p44elovod.elevator;


import lombok.Getter;

import java.util.UUID;

@Getter
public class User {


    private Long id;
    private Integer weight;
    private Integer baggageWaight;


    public User(Integer weight, Integer baggageWaight) {
        this.id = UUID.randomUUID().getMostSignificantBits();
        this.weight = weight;
        this.baggageWaight = baggageWaight;
    }
}
