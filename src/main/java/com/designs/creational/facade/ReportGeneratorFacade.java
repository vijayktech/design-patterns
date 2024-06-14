package com.designs.creational.facade;

import javax.sql.DataSource;

public class ReportGeneratorFacade {
    public void generateReport(ReportType type, DataSource source, String location){
        if(type == null || source == null){
            // Throw Report Type is not defined.
        }

        // Create Report
        Report report = new Report();
        report.setHeader(new ReportHeader());
        report.setFooter(new ReportFooter());

        // Get data from Database and set to Report
        report.setData(new ReportData());

        ReportWriter writer = new ReportWriter();
        // Write Report
        if(ReportType.HTML.equals(type)){
            writer.writeHTMLReport(report, location);
        }else if(ReportType.PDF.equals(type)){
            writer.writePDFReport(report, location);
        }else{
            System.out.println("Report Type is not defined !!");
        }
    }
}
