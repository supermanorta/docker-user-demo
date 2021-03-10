package com.tefnick.config;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@ToString
@NoArgsConstructor
@Configuration                   // Source of Bean
@ConfigurationProperties("yaml") // binds and validates the external configuration to a config class
@EnableConfigurationProperties   // enables @ConfigurationProperties annotated bean in the spring app

public class ProfileConfig {
    private String name;
    private String environment;
    private boolean enable;
    private List<String> servers = new ArrayList<>();

    ProfileConfig(String name, String env, boolean enable, List<String> servers){
        this.name = name;
        this.environment=env;
        this.enable=enable;
        this.servers = servers;
    }

}
