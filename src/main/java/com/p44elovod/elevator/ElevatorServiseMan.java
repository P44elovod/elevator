package com.p44elovod.elevator;

public class ElevatorServiseMan extends User{

    private String skillLevel;
    private String reactionTime;
    private boolean drunk;

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    public String getReactionTime() {
        return reactionTime;
    }

    public void setReactionTime(String reactionTime) {
        this.reactionTime = reactionTime;
    }

    public boolean isDrunk() {
        return drunk;
    }

    public void setDrunk(boolean drunk) {
        this.drunk = drunk;
    }
}
