package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Myriad
 * Date: 9/17/16
 * Time: 4:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        //  read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        //  get the bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        //  call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        //  call our new swim coach methods...
        System.out.println("email: "+ theCoach.getEmail());
        System.out.println("team: "+ theCoach.getTeam());

        //  close the context
        context.close();
    }
}
