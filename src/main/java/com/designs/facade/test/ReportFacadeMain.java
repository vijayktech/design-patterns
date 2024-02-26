package com.designs.facade.test;

import com.designs.facade.ReportGeneratorFacade;
import com.designs.facade.ReportType;

public class ReportFacadeMain {
    public static void main(String[] args){
        // Facade provides a unified interface to a set of interfaces in a subsystem
        ReportGeneratorFacade facade = new ReportGeneratorFacade();
        // HTML Report
        facade.generateReport(ReportType.HTML, null, null);
        // PDF Report
        facade.generateReport(ReportType.PDF, null, null);
    }
}
