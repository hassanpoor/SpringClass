package org.example.DI;

public class FootballCoach implements Coach {
    FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "its your football daily workout";
    }

    @Override
    public String getMyFortune() {
        return fortuneService.getMyFortune();
    }
}
