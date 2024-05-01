package org.example.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOC {
    public static void main(String[] args) {
        //load the spring configuration file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextIOC.xml");
        // retrieve bean from spring container
        Coach coach = context.getBean("baseBall", Coach.class);
        // call methods on the bean
        System.out.println(coach.getDailyWorkOut());
        // close the context
        context.close();
    }
}
