package com.tefnick.userservice.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Configuration                   // Source of Bean
@ConfigurationProperties("spring.datasource") // binds and validates the external configuration to a config class
//@EnableConfigurationProperties   // enables @ConfigurationProperties annotated bean in the spring app
public class DataSrc {
    public String name;
    private ArrayList<String> url;

    @Override
    public String toString(){
        return this.name ;
    }
}
