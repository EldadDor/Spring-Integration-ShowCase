package com.ead.spring.intergration.aggregator.market;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

/**
 * Created by EAD-MASTER on 24/4/2015.
 */
@Service
public class PalletsInspectedHandler {
	private static final Log log = LogFactory.getLog(PalletsInspectedHandler.class);

	@ServiceActivator(inputChannel = "FinalInspectionChannel", outputChannel = "OutPutPalletsChannel")
	public Message<?> handlePallets(Message<?> pallets) {
		log.info("handlePallets():");
		return pallets;
	}

	//	@ServiceActivator(inputChannel = "OutPutPalletsChannel")
	public void handlePallet(@Header(value = "PALLET", required = false) String header, Message<?> pallets) {
//	public void handlePallet(Message<?> pallets) {
		log.info("handlePallets():");
	}

}
