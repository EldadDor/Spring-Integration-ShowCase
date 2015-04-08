package com.ead.spring.intergration.dsl;

import org.springframework.context.annotation.Bean;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.channel.MessageChannels;
import org.springframework.integration.dsl.core.Pollers;
import org.springframework.integration.endpoint.MethodInvokingMessageSource;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by EAD-MASTER on 8/4/2015.
 */
public class FilterConfiguration {
	@Bean
	public MessageSource<?> integerMessageSource() {
		MethodInvokingMessageSource source = new MethodInvokingMessageSource();
		source.setObject(new AtomicInteger());
		source.setMethodName("getAndIncrement");
		return source;
	}
	@Bean
	public DirectChannel inputChannel() {
		return new DirectChannel();
	}
	@Bean
	public IntegrationFlow myFlow() {
		return IntegrationFlows.from(this.integerMessageSource(), c ->
				c.poller(Pollers.fixedRate(100)))
				.channel(this.inputChannel())
				.filter((Integer p) -> p > 0)
				.transform(Object::toString)
				.channel(MessageChannels.queue())
				.get();
	}
}
