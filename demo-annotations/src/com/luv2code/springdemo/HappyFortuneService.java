package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: Myriad
 * Date: 9/17/16
 * Time: 5:23 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
