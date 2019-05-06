package com.anton.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.anton.demo.dao"})
public class ApplicationConfiguration extends WebMvcConfigurerAdapter {

}
