package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created with IntelliJ IDEA.
 * User: Myriad
 * Date: 9/21/16
 * Time: 6:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Value("${foo.team}")
    private String team;

    public SwimCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
