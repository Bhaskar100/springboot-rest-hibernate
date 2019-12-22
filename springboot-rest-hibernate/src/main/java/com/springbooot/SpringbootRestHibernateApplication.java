package com.springbooot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringbootRestHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestHibernateApplication.class, args);
	}

}
