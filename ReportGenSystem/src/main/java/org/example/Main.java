package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        ReportController controller = context.getBean(ReportController.class);

        controller.createReport("Sales Data 2026");
    }
}
