package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Myriad
 * Date: 7/19/16
 * Time: 8:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class SetterDemoApp {

    public static void main(String[] args) {

        //  load the spring configuration file
        ClassPathXmlApplicationContext contex =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        CricketCoach theCoach = contex.getBean("myCricketCoach", CricketCoach.class);

        //  call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmailAdress());

        System.out.println(theCoach.getTeam());

        //  close the context
        contex.close();
    }
}
