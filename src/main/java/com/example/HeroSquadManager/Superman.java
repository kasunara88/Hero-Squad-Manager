package com.example.HeroSquadManager;

public class Superman implements Hero {
    private String powerLevel;
    private int experience;

    public Superman(String powerLevel, int experience) {
        this.powerLevel = powerLevel;
        this.experience = experience;
    }

    @Override
    public void action() {
        System.out.printf("Superman with power level %s and %d years of experience is flying!%n", powerLevel, experience);

    }
}
