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
        Coach volleyCoach = context.getBean("volleyCoach", Coach.class);

        //call a method on the bean
        System.out.println("Tennis Coach: " + theCoach.getDailyWorkout());
        System.out.println("Volley Coach: " + volleyCoach.getDailyWorkout());

        //call method to get daily fortune
        System.out.println("Daily Fortune(Tennis): " + theCoach.getDailyFortune());
        System.out.println("Daily Fortune(Volley): " + volleyCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
