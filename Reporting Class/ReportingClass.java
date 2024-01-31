package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {
	
	
public static void reportGenertor(String jason) {
	
	File file= new File("target");
	
	
	Configuration con = new Configuration(file, "Adactin Hotel Webpage Login");
	
	con.addClassifications("UserId", "10000");
	con.addClassifications("UserStoryNumber", "12000");
	con.addClassifications("Platform", "Eclips-photon");
	con.addClassifications("FunctionalName", "LoginFunctional");
	con.addClassifications("Dependency", "CucumberReportingDependency");
	
	List<String> li = new LinkedList<String>();
	li.add(jason);
	
	ReportBuilder report = new ReportBuilder( li, con);
	report.generateReports();
	
	
	
	
	
	
	
	
	
	
}

 }
