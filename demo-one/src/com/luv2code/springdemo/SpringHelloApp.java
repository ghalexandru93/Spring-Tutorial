package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Myriad
 * Date: 7/18/16
 * Time: 4:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class SpringHelloApp {

    public static void main(String args[]) {

        //  load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //  retrieve bean from the spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //  call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        //  close the context
        context.close();
    }
}
