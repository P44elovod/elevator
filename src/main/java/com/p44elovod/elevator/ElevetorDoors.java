package com.p44elovod.elevator;


import lombok.Getter;

import java.util.UUID;

@Getter
public class ElevetorDoors {

    private Long id;
    private Double motionSpeed;


    public ElevetorDoors(Double motionSpeed) {

        this.id = UUID.randomUUID().getMostSignificantBits();
        this.motionSpeed = motionSpeed;
    }

    public Double getMotionSpeed() {
        return motionSpeed;
    }

    public void setMotionSpeed(Double motionSpeed) {
        this.motionSpeed = motionSpeed;
    }
}
