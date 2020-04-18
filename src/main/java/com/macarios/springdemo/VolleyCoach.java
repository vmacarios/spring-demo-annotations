package com.macarios.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class VolleyCoach implements Coach {
    //    @Autowired
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public VolleyCoach() {
        System.out.println("Volley: Inside default constructor");
    }

    @Autowired
    @Qualifier("fileFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Volley: Inside setter injection");
        this.fortuneService = fortuneService;
    }

    //define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("VolleyCoach: Inside of doMyStartupStuff");
    }

    //define my destroy method
    @PreDestroy
    public void doMyCleanUpStuff(){
        System.out.println("VolleyCoach: Inside of doMyCleanUpStuff");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice serve";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
