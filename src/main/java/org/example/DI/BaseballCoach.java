package org.example.DI;

public class BaseballCoach implements Coach {
    FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "its your baseBall daily workout";
    }

    @Override
    public String getMyFortune() {
        return fortuneService.getMyFortune();
    }
}
