package com.luv2code.springdemo;

/**
 * Created with IntelliJ IDEA.
 * User: Myriad
 * Date: 7/19/16
 * Time: 8:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAdress;
    private String team;

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        System.out.println("CricketCoach: inside setter method - setEmailAdress");
        this.emailAdress = emailAdress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }

    //  create a no-arg constructor
    public CricketCoach(){
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    //  out setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
