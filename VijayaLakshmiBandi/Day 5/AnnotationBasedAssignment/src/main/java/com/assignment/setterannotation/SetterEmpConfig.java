package com.assignment.setterannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SetterEmpConfig {
	@Bean
	public SetterEmployee displayEmp() {
		return new SetterEmployee();
	}
}
