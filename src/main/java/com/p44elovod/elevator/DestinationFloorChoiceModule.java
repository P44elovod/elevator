package com.p44elovod.elevator;

import lombok.Getter;

import java.util.UUID;

@Getter
public class DestinationFloorChoiceModule {

    private Long id;
    private Integer floorNumber;

    public DestinationFloorChoiceModule(Integer floorNumber) {
        this.id = UUID.randomUUID().getMostSignificantBits();
        this.floorNumber = floorNumber;
    }


}
