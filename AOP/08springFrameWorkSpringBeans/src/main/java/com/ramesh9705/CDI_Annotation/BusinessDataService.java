package com.ramesh9705.CDI_Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;
//@Component
@Named
public class BusinessDataService
{
	DataService dataService;
	
//	@Autowired
	@Inject
	public void setDataService(DataService dataService) {
		System.out.println("Setter Injection Done");
		this.dataService = dataService;
	}

	public DataService getDataService() {
		System.out.println("getter Injection Done");
		return dataService;
	}

	
}
