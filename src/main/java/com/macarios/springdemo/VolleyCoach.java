package com.macarios.springdemo;

import org.springframework.stereotype.Component;

@Component
public class VolleyCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice serve";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
