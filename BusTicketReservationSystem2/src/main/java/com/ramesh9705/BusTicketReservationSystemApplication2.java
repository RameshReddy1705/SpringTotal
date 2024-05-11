package com.ramesh9705;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
public class BusTicketReservationSystemApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(BusTicketReservationSystemApplication2.class, args);
	}
	
//	@Bean
//	public LocalValidatorFactoryBean validator(MessageSource ms) {
//		LocalValidatorFactoryBean l = new LocalValidatorFactoryBean();
//		
//		l.setValidationMessageSource(ms);
//		
//		return l;
//	}

}
