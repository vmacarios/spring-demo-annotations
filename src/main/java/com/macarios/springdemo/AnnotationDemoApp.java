package com.macarios.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp
{
    public static void main( String[] args )
    {
        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from spring container
        Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
        VolleyCoach volleyCoach = context.getBean("volleyCoach", VolleyCoach.class);

        //call a method on the bean
        System.out.println("Tennis Coach: " + theCoach.getDailyWorkout());
        System.out.println("Volley Coach: " + volleyCoach.getDailyWorkout());

        //call method to get daily fortune
        System.out.println("Daily Fortune(Tennis): " + theCoach.getDailyFortune());
        System.out.println("Daily Fortune(Volley): " + volleyCoach.getDailyFortune());

        //call the values from properties files
        System.out.println("Email: " + volleyCoach.getEmail());
        System.out.println("Team: " + volleyCoach.getTeam());

        //close the context
        context.close();
    }
}
