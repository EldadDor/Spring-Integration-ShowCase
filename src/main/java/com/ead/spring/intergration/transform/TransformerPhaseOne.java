package com.ead.spring.intergration.transform;

import com.ead.spring.intergration.route.model.PhaseOnePojo;
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
public class TransformerPhaseOne {
	private static final Log log = LogFactory.getLog(TransformerPhaseOne.class);

	@Transformer
	public Message<TransformationPhase> transform(Message<?> message) {
		log.info("transform(): PhaseOne");
		final TransformationPhase phaseOnePojo = new PhaseOnePojo(((File) message.getPayload()).getName());
		return MessageBuilder.createMessage(phaseOnePojo, message.getHeaders());
	}
}
