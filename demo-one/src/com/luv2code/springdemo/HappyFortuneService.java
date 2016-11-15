package com.luv2code.springdemo;

/**
 * Created with IntelliJ IDEA.
 * User: Myriad
 * Date: 7/18/16
 * Time: 5:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
