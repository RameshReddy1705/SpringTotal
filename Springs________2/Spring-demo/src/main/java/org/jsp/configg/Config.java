package org.jsp.configg;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "org.jsp")
public class Config
{
	@Bean
	public EntityManager getEntityMa()
	{
		return Persistence.createEntityManagerFactory("dev").createEntityManager();
	}

}
