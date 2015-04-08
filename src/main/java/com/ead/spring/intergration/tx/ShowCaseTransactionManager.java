/*
 * User: eldad.Dor
 * Date: 22/03/2015 18:20
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.ead.spring.intergration.tx;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.integration.transaction.PseudoTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.support.DefaultTransactionStatus;

/**
 * @author eldad
 * @date 22/03/2015
 */
public class ShowCaseTransactionManager extends PseudoTransactionManager {
	private static final Log log = LogFactory.getLog(ShowCaseTransactionManager.class);

	@Override
	protected Object doGetTransaction() throws TransactionException {
		return super.doGetTransaction();
	}

	@Override
	protected void doBegin(Object transaction, TransactionDefinition definition) throws TransactionException {
		super.doBegin(transaction, definition);
	}

	@Override
	protected void doCommit(DefaultTransactionStatus status) throws TransactionException {
		super.doCommit(status);
	}

	@Override
	protected DefaultTransactionStatus newTransactionStatus(TransactionDefinition definition, Object transaction, boolean newTransaction, boolean newSynchronization, boolean debug, Object suspendedResources) {
		return super.newTransactionStatus(definition, transaction, newTransaction, newSynchronization, debug, suspendedResources);
	}

	@Override
	protected void doRollback(DefaultTransactionStatus status) throws TransactionException {
		super.doRollback(status);
	}
}