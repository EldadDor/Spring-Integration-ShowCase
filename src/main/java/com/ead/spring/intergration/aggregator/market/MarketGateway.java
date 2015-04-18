package com.ead.spring.intergration.aggregator.market;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

/**
 * Created by EAD-MASTER on 18/4/2015.
 */
@MessagingGateway
public interface MarketGateway {
	@Gateway(requestChannel = "InitialPalletsChannel")
	void placeDelivery(Pallet pallet);
}
