package com.rep.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "com.rep.entity")
@EnableJpaRepositories(basePackages = "com.rep.repo")
public class ApplicaitonConfig {
    
}
