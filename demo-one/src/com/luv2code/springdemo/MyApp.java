package com.luv2code.springdemo;

/**
 * Created with IntelliJ IDEA.
 * User: Myriad
 * Date: 7/18/16
 * Time: 3:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyApp {
    public static void main(String args[]) {

        //  create the object
        Coach theCoach = new TrackCoach();

        //  use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
