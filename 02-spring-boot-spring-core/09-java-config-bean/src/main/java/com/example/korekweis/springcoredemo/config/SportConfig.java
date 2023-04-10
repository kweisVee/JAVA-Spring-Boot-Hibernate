package com.example.korekweis.springcoredemo.config;

import com.example.korekweis.springcoredemo.common.Coach;
import com.example.korekweis.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquaticBean")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
