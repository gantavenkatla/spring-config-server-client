package com.config.springconfigserverclient.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mule-service")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MuleConfig {
    private String pewc;
    private  String paperless;
    private  String register;
}
