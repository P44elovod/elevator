package com.p44elovod.elevator;

import lombok.Getter;

import java.util.UUID;

@Getter
public class ElevatorServiseMan {

    private Long id;
    private Integer age;
    private String skillLevel;
    private String reactionTime;
    private boolean drunk;

    public ElevatorServiseMan(Integer age, String skillLevel, String reactionTime, boolean drunk) {

        this.id = UUID.randomUUID().getMostSignificantBits();
        this.age = age;
        this.skillLevel = skillLevel;
        this.reactionTime = reactionTime;
        this.drunk = drunk;
    }
}
