package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan("org.example")
@Configuration
public class ExcelReportService implements ReportService{
    public void generateReport(String data){
        System.out.println("Generating report " + data + " from Excel Report Service");
    }
}
