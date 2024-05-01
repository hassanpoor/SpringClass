package org.example.DI;

public class CricketCoach implements Coach{
    FortuneService fortuneService;
    public CricketCoach() {
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "work cricket";
    }

    @Override
    public String getMyFortune() {
        return fortuneService.getMyFortune();
    }
}
