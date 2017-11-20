package com.p44elovod.elevator;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Elevator {

    private ElevatorCar elevatorCar;
    private ElevetorDoors elevetorDoors;
    private DestinationFloorChoiceModule destinationFloorChoiceModule;
    private Long id;

    public Elevator(ElevatorCar elevatorCar, ElevetorDoors elevetorDoors, DestinationFloorChoiceModule destinationFloorChoiceModule) {
        this.id = UUID.randomUUID().getMostSignificantBits();
        this.elevatorCar = elevatorCar;
        this.elevetorDoors = elevetorDoors;
        this.destinationFloorChoiceModule = destinationFloorChoiceModule;
    }
}
