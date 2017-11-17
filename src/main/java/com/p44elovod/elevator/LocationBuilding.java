package com.p44elovod.elevator;

import lombok.Getter;

import java.util.UUID;

@Getter
public class LocationBuilding {
    private Long id;
    private Integer floorQuantity;

    public LocationBuilding(Integer floorQuantity) {
        this.id = UUID.randomUUID().getMostSignificantBits();
        this.floorQuantity = floorQuantity;
    }
}
