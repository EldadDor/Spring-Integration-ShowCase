package com.ead.spring.intergration.aggregator;

import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;

/**
 * Created by EAD-MASTER on 11/4/2015.
 */
@Configuration
@EnableIntegration
@IntegrationComponentScan(basePackages = "com.ead.spring.intergration.aggregator")
public class GatewayConfiguration {
}
