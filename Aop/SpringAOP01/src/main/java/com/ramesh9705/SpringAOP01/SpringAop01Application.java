package com.ramesh9705.SpringAOP01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ramesh9705.SpringAOP01.AopExample.Business.Business01;
import com.ramesh9705.SpringAOP01.AopExample.Business.Business02;

@SpringBootApplication
public class SpringAop01Application implements CommandLineRunner {

	private Logger logger=LoggerFactory.getLogger(getClass());
	@Autowired
	private Business01 business01;
	@Autowired
	private Business02 business02;
	public static void main(String[] args) {
		SpringApplication.run(SpringAop01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		logger.info("Value returned is {}",business01.calculateMax());
		logger.info("Value returned is {}",business02.calculateMin());
	}

}
