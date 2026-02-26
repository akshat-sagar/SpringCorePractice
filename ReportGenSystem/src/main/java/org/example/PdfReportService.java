package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class PdfReportService implements ReportService{

    public void generateReport(String data){
        System.out.println("Generating report " + data + " from Pdf report service.");
    }
}
