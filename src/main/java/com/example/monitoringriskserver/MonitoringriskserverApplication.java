package com.example.monitoringriskserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.baeldung.persistence.repo")
@EntityScan("com.baeldung.persist.model")
@SpringBootApplication
public class MonitoringriskserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitoringriskserverApplication.class, args);
    }

}
