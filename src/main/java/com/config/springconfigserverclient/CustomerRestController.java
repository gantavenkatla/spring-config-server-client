package com.config.springconfigserverclient;

import com.config.springconfigserverclient.config.DbConfig;
import com.config.springconfigserverclient.config.MuleConfig;
import com.config.springconfigserverclient.config.OktaConfig;
import com.config.springconfigserverclient.config.SalesforceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class CustomerRestController {

    @Autowired
    DbConfig dbConfig;

    @Autowired
    MuleConfig muleConfig;

    @Autowired
    OktaConfig oktaConfig;

    @Autowired
    SalesforceConfig salesforceConfig;

    @GetMapping("/db")
    public DbConfig dbConfig() {
        return dbConfig;
    }

    @GetMapping("/mule")
    public MuleConfig muleConfig() {
        return muleConfig;
    }

    @GetMapping("/salesforce")
    public SalesforceConfig salesforceConfig() {
        return salesforceConfig;
    }


    @GetMapping("/okta")
    public OktaConfig oktaConfig() {
        return oktaConfig;
    }
}