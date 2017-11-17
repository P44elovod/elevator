package com.p44elovod.elevator;

import lombok.Getter;

import java.util.UUID;

@Getter
public class DestinationFloorChoiceModule {

    private Long id;
    private FloorNumbers floorNumber;

    public DestinationFloorChoiceModule(FloorNumbers floorNumber) {
        this.id = UUID.randomUUID().getMostSignificantBits();
        this.floorNumber = floorNumber;
    }

    enum FloorNumbers {ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE}
}
