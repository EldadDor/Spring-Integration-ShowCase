package com.ead.spring.intergration.splitter;

import com.google.common.collect.Lists;
import org.springframework.integration.annotation.Splitter;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by EAD-MASTER on 11/4/2015.
 */
@Service
public class SplitterBean {
	@Splitter
	public List<Message<?>> split(Message<?> message) {
		final List<Message<?>> list = Lists.newLinkedList();
		return list;
	}
}
