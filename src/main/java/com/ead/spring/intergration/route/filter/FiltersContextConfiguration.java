package com.ead.spring.intergration.route.filter;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.config.EnableMessageHistory;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.channel.MessageChannels;
import org.springframework.integration.dsl.core.Pollers;
import org.springframework.integration.file.FileReadingMessageSource;
import org.springframework.integration.file.config.FileReadingMessageSourceFactoryBean;
import org.springframework.integration.scheduling.PollerMetadata;
import org.springframework.messaging.MessageChannel;
import org.springframework.scheduling.concurrent.ThreadPoolExecutorFactoryBean;

import java.io.File;
import java.util.concurrent.ExecutorService;

/**
 * Created by EAD-MASTER on 7/4/2015.
 */
//@Configuration
@EnableMessageHistory
@EnableIntegration
public class FiltersContextConfiguration {
	@Bean
	public MessageChannel queueChannel() {
		return MessageChannels.queue().get();
	}

	@Bean
	public MessageChannel publishSubscribe() {
		return MessageChannels.publishSubscribe().get();
	}

	@Bean(name = PollerMetadata.DEFAULT_POLLER)
	public PollerMetadata poller() {
		return Pollers.fixedRate(500).get();
	}
	@Bean
	PdfFilesChannelOnlyEndPoint endPoint() {
		return new PdfFilesChannelOnlyEndPoint();
	}

	@Bean
	@Autowired
	public IntegrationFlow channelFlow(ExecutorService executorService, FileReadingMessageSource fileReadingMessageSource) throws Exception {
//		return IntegrationFlows.from("input")
		return IntegrationFlows.from(fileReadingMessageSource,spec ->spec.poller(poller()) )
//				.fixedSubscriberChannel()
//				.channel("queueChannel")
//				.channel(publishSubscribe())
//				.channel(MessageChannels.executor("executorChannel", executorService))
//				.channel("output")
				.handle("endPoint","handle")

				.get();
	}


	@Bean
	FactoryBean<FileReadingMessageSource> createReadingMessageSourceFactoryBean() {
		final FileReadingMessageSourceFactoryBean factoryBean = new FileReadingMessageSourceFactoryBean();
		factoryBean.setDirectory(new File("E:/Downloads"));
		factoryBean.setQueueSize(10);
		return factoryBean;
	}

	@Bean
	FactoryBean<ExecutorService> filterExecutorFactoryBean() throws Exception {
		final ThreadPoolExecutorFactoryBean factoryBean = new ThreadPoolExecutorFactoryBean();
		factoryBean.setCorePoolSize(10);
		factoryBean.setMaxPoolSize(12);
		factoryBean.setBeanName("filterExecutor");
		factoryBean.setQueueCapacity(10);
		return factoryBean;
	}
}
