package com.ead.spring.intergration.transform;

import com.ead.spring.intergration.route.model.PhaseTwoPojo;
import com.ead.spring.intergration.route.model.TransformationPhase;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.integration.annotation.Transformer;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * Created by EAD-MASTER on 8/4/2015.
 */
@Service
public class TransformerPhaseTwo {
	private static final Log log = LogFactory.getLog(TransformerPhaseTwo.class);

	@Transformer
	public Message<TransformationPhase> transform(Message<?> message) {
		log.info("transform(): PhaseTwo");
		final TransformationPhase phaseTwoPojo = new PhaseTwoPojo(((File) message.getPayload()).length());
		return MessageBuilder.createMessage(phaseTwoPojo, message.getHeaders());
	}
}
