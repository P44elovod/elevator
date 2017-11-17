package com.p44elovod.elevator;

import lombok.Getter;

import java.util.UUID;

@Getter
public class ElevatorCallModule {

    private Long id;
    private Direction direction;

    public ElevatorCallModule(Direction direction) {
        this.id = UUID.randomUUID().getMostSignificantBits();
        this.direction = direction;
    }

    enum Direction {UP, DOWN}
}
