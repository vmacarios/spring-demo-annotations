package com.macarios.springdemo;

import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
public class RandomFortuneService implements FortuneService {
    //create an array of strings
    private String[] fortunes = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };



    @Override
    public String getFortune() {
        //pick a random string from the array
        int index = ThreadLocalRandom.current().nextInt(0, fortunes.length);
        return fortunes[index];
    }
}
