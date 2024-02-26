package com.designs.facade;

public class ReportWriter {
    public void writeHTMLReport(Report report, String location){
        System.out.println("ReportWriter - writeHTMLReport()");
    }

    public void writePDFReport(Report report, String location){
        System.out.println("ReportWriter - writePDFReport()");
    }
}
