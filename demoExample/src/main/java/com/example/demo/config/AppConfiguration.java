package com.example.demo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author Biswa Bhusan Sahoo
 *
 */
@Configuration
public class AppConfiguration {

	/*Model Mapper to convert dto to entity and viceversa*/
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
