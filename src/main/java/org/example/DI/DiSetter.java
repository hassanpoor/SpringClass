package org.example.DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiSetter {
    public static void main(String[] args) {
        //load the spring configuration file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextDI.xml");
        // retrieve bean from spring container
        Coach coach = context.getBean("criket", Coach.class);
        // call methods on the bean
        System.out.println(coach.getDailyWorkOut());
        System.out.println(coach.getMyFortune());
        // close the context
        context.close();
    }
}
