package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Myriad
 * Date: 9/17/16
 * Time: 12:09 AM
 * To change this template use File | Settings | File Templates.
 */
public class BeanScopeDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrive bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        //  check if they are the same
        boolean result = (theCoach == alphaCoach);

        System.out.println("\nPointing to the same object " + result);

        System.out.println("\n Memory location for theCoach " + theCoach);
        System.out.println("\n Memory location for alphaCoach " + alphaCoach);

        context.close();
    }
}
