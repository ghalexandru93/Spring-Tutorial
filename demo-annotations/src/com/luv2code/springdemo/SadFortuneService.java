package com.luv2code.springdemo;

/**
 * Created with IntelliJ IDEA.
 * User: Myriad
 * Date: 9/21/16
 * Time: 6:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is a sad day";
    }
}
