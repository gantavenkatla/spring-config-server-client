package com.config.springconfigserverclient.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("db-service")
@Getter
@Setter
public class DbConfig {
    private String host;
    private String username;
    private String password;

}
