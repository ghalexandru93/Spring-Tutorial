package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Myriad
 * Date: 9/20/16
 * Time: 9:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        //  load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //  retrive bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        //  check if they are the same
        boolean result = (theCoach == alphaCoach);

        //  print out the results
        System.out.println("\nPointing to the same object " + result);

        System.out.println("\nMemory location for theCoach " + theCoach);

        System.out.println("\nMemory location for alphaCoach " + alphaCoach);

        context.close();

    }
}
