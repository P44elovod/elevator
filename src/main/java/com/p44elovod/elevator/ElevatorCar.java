package com.p44elovod.elevator;


import lombok.Getter;

import java.util.UUID;

@Getter
public class ElevatorCar {

    private Long id;
    private Integer height;
    private Integer width;
    private Integer length;
    private Integer carryingCapacity;


    public ElevatorCar(Integer height, Integer width, Integer length, Integer carryingCapacity) {

        this.id = UUID.randomUUID().getMostSignificantBits();
        this.height = height;
        this.width = width;
        this.length = length;
        this.carryingCapacity = carryingCapacity;
    }


}



