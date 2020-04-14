package com.macarios.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VolleyCoach implements Coach {
    private FortuneService fortuneService;

    public VolleyCoach() {
        System.out.println("Volley: Inside default constructor");
    }

    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Volley: Inside setter injection");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice serve";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
