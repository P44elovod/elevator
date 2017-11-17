package com.p44elovod.elevator;

import java.util.UUID;

public class Elevator {

    ElevatorCar elevatorCar;
    ElevetorDoors elevetorDoors;
    DestinationFloorChoiceModule destinationFloorChoiceModule;
    private Long id;

    public Elevator(ElevatorCar elevatorCar, ElevetorDoors elevetorDoors, DestinationFloorChoiceModule destinationFloorChoiceModule) {
        this.id = UUID.randomUUID().getMostSignificantBits();
        this.elevatorCar = elevatorCar;
        this.elevetorDoors = elevetorDoors;
        this.destinationFloorChoiceModule = destinationFloorChoiceModule;
    }
}
