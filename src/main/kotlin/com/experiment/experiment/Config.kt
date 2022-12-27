package com.experiment.experiment

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Config {

    @Bean
    fun Address():Address{
        return  Address("florida",2332)
    }
}