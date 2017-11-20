package com.p44elovod.elevator;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Floor {


    private ElevatorCallModule elevatorCallModule;
    private Long id;
    private Integer nunmber;
    private ElevetorDoors elevetorDoors;

    public Floor(Integer nunmber, ElevatorCallModule elevatorCallModule, ElevetorDoors elevetorDoors) {
        this.id = UUID.randomUUID().getMostSignificantBits();
        this.nunmber = nunmber;
        this.elevatorCallModule = elevatorCallModule;
        this.elevetorDoors = elevetorDoors;
    }


}
