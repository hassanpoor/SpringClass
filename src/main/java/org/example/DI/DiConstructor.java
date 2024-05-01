package org.example.DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiConstructor {
    public static void main(String[] args) {
        //load the spring configuration file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextDI.xml");
        // retrieve bean from spring container
        Coach coach = context.getBean("baseBall", Coach.class);
        // call methods on the bean
        System.out.println(coach.getDailyWorkOut());
        System.out.println(coach.getMyFortune());
        // close the context
        context.close();
    }
}
