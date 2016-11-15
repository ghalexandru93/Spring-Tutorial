package com.luv2code.springdemo;

/**
 * Created with IntelliJ IDEA.
 * User: Myriad
 * Date: 7/18/16
 * Time: 3:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class BaseballCoach implements Coach {

    //  define  a private filed for the dependency
    private FortuneService fortuneService;

    //  define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {

        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {

        //  use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
