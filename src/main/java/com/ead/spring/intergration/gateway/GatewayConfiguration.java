package com.ead.spring.intergration.gateway;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;

/**
 * Created by EAD-MASTER on 11/4/2015.
 */
@Configuration
@EnableIntegration
@ImportResource(value = "/spring/integration/gateways/showcase-context-simpleAnnotatedGateway.xml",
		reader = XmlBeanDefinitionReader.class)
@IntegrationComponentScan(basePackages = "com.ead.spring.intergration.gateway")
public class GatewayConfiguration {
}
