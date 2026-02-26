package org.example;

import org.springframework.context.annotation.Bean;

public class Config {

    @Bean
    public  ReportService reportService(){
        return new PdfReportService();

    }
    @Bean
    public ReportController reportController(){
        return new ReportController(reportService());
    }
}
