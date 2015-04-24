package com.ead.spring.intergration.aggregator.market;

import org.springframework.integration.aggregator.ReleaseStrategy;
import org.springframework.integration.store.MessageGroup;

/**
 * Created by EAD-MASTER on 18/4/2015.
 */
//@Service
public class FruitsBoxReleaseStrategy implements ReleaseStrategy {
	@Override
	public boolean canRelease(MessageGroup group) {
		return false;
	}
}
