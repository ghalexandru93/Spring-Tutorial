package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Myriad
 * Date: 9/17/16
 * Time: 4:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class JavaConfigDemoApp {

    public static void main(String[] args) {

        //  read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        //  get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //  call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        //  close the context
        context.close();
    }
}
