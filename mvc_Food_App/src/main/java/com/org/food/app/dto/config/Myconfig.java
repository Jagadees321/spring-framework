package com.org.food.app.dto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.org.food.app.dao.Admindao;

@Configuration
public class Myconfig {
	@Bean
    public Admindao adminDao() {
        return new Admindao();
    }
}
