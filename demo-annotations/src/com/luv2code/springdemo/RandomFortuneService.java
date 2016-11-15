package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Myriad
 * Date: 9/17/16
 * Time: 6:01 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class RandomFortuneService implements FortuneService {

    //  create an array of strings
    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey if the reward"
    };

    //  create a random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        //  pick a random string from the array
        int index = myRandom.nextInt(data.length);

        String theFortune = data[index];

        return theFortune;
    }
}
