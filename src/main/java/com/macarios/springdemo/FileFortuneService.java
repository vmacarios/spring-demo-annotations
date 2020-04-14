package com.macarios.springdemo;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class FileFortuneService implements FortuneService {
    File file = new File("/Users/victor/IdeaProjects/spring-demo-annotations/src/main/resources/fortunes.txt");
    List<String> fortunesList = new ArrayList<>();

    public FileFortuneService() {

        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            String fortune;
            while ((fortune = bf.readLine()) != null) {
                fortunesList.add(fortune);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        int index = ThreadLocalRandom.current().nextInt(0, fortunesList.size());
        return fortunesList.get(index);
    }
}
