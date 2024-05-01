package org.example.DI;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getMyFortune() {
        return "good lock this is your fortune";
    }
}
