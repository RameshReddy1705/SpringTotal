package org.docNmeds.ramesh.docNmedsBackEndRestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class DocNmedsBackEndRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocNmedsBackEndRestApiApplication.class, args);
	}

}
