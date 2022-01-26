package com.config.springconfigserverclient.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("salesforce-service")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SalesforceConfig {
    private String user;
    private  String delete;
    private  String clientId;
    private  String secret;

}
