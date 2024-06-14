package com.designs.creational.facade;

public class Report {
    private ReportHeader header;
    private ReportData data;
    private ReportFooter footer;

    public ReportHeader getHeader() {
        return header;
    }

    public void setHeader(ReportHeader header) {
        System.out.println("Report - setHeader()");
        this.header = header;
    }

    public ReportData getData() {
        return data;
    }

    public void setData(ReportData data) {
        System.out.println("Report - setData()");
        this.data = data;
    }

    public ReportFooter getFooter() {
        return footer;
    }

    public void setFooter(ReportFooter footer) {
        System.out.println("Report - setFooter()");
        this.footer = footer;
    }
}
