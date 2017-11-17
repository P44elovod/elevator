package com.p44elovod.elevator;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Floor {


    ElevatorCallModule elevatorCallModule;
    private Long id;
    private Integer nunmber;


    public Floor(Integer nunmber, ElevatorCallModule elevatorCallModule) {
        this.id = UUID.randomUUID().getMostSignificantBits();
        this.nunmber = nunmber;
        this.elevatorCallModule = elevatorCallModule;
    }


}
