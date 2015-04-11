package com.ead.spring.intergration.gateway;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by EAD-MASTER on 10/4/2015.
 */
@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class SimpleRequest {
	private String someMessageExtra;

	public SimpleRequest(String someMessageExtra) {
		this.someMessageExtra = someMessageExtra;
	}

	public String getSomeMessageExtra() {
		return someMessageExtra;
	}

	public void setSomeMessageExtra(String someMessageExtra) {
		this.someMessageExtra = someMessageExtra;
	}
}
