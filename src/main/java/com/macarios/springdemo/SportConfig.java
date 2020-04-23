package com.macarios.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.macarios.springdemo")
@PropertySource("sports.properties")
public class SportConfig {

}
