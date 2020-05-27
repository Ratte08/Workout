package com.example.workout;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
      new Workout("Limb Loosener", "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
      new Workout("Core Agony", "100 abc\n200 bcd\n300 cde"),
      new Workout("The Wimp Special", "1 gfg\n2 fsdfsfd\n3 dsfhsdgjasg\n5 fffffffff"),
      new Workout("Strength and Length", "123 ololo\n4444 ggggg\n146 yyyyyyyyyyyy")
    };

    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
