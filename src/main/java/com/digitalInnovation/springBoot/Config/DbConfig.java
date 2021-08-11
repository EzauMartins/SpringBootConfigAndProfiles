package com.digitalInnovation.springBoot.Config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DbConfig {

                                            //PEGA TODAS AS PROPRIEDADES DO Applicantion(Dev,PROD)
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")     ///ANTES DESSE PROCESSO DE PROFILE CRIAR OS ARQUIVOS Applicantion(Dev,PROD)
    @Bean
    public String testDataBaseConnection(){

        System.out.println("DB Connection For Dev");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB connection to H2_TESte - Teste instance";

    }
    @Profile("prod")
    @Bean
    public String productionDataBaseConnection(){

        System.out.println("DB Connection For Production");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB connection to MYSQL_PROD - PROD instance";

    }
}
