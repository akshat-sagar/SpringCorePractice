package org.example;

import org.springframework.stereotype.Component;

@Component
public class ReportController {

    private ReportService reportService;

    //constructor injection
    public ReportController(ReportService reportService){
        this.reportService = reportService;

    }
    public void createReport(String data){
        reportService.generateReport(data);
    }
}
