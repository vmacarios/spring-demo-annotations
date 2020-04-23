package com.macarios.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp
{
    public static void main( String[] args )
    {
        //read spring config file (or java class)
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from spring container
        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        //call a method on the bean
        System.out.println("Swim Coach: " + swimCoach.getDailyWorkout());

        //call method to get daily fortune
        System.out.println("Daily Fortune(Swim): " + swimCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
