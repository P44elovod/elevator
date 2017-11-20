package com.p44elovod.elevator;


import lombok.Getter;

import java.util.UUID;

@Getter
public class ElevetorDoors {

    private Long id;
    private double motionSpeed;
    private DoorsState doorsState;


    public ElevetorDoors(double motionSpeed, DoorsState doorsState) {

        this.id = UUID.randomUUID().getMostSignificantBits();
        this.motionSpeed = motionSpeed;
        this.doorsState = doorsState;
    }

    enum DoorsState {OPEN, CLOSED, OPENING, CLOSING}


}
