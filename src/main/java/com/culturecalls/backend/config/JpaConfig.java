package com.culturecalls.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

import javax.persistence.EntityManagerFactory;

// Tells Spring that the following is a configuration file
@Configuration
    @EnableJpaRepositories(basePackages = "com.culturecalls.backend.repositories")
    public class JpaConfig {

        public LocalEntityManagerFactoryBean entityManagerFactory(){
            LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
            factoryBean.setPersistenceUnitName("adventuredb");
            return factoryBean;
        }

        @Bean
        public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory){
            JpaTransactionManager transactionManager = new JpaTransactionManager();
            transactionManager.setEntityManagerFactory(entityManagerFactory);
            return transactionManager;
        }
}
