package org.ramesh9705.springBootBasicWebApplicationCourse.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Currency_Configuration_Controller
{
	@Autowired
	private CurrencyServiceConfiguration currency_Configuration;

	@RequestMapping("/currency-Configuration")
	public CurrencyServiceConfiguration retriveconfiguration()
	{
		return currency_Configuration;
	}
}
