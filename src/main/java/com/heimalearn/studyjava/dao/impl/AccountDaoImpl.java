package com.heimalearn.studyjava.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.heimalearn.studyjava.dao.IAccountDao;

/**
 * @author ZhouPan
 * @date 2020-01-08
 */
@Component
public class AccountDaoImpl implements IAccountDao {
	private static final Logger LOGGER = LoggerFactory.getLogger(AccountDaoImpl.class);

	private  int i = 1;

	@Override
	public void saveAccount() {
		LOGGER.info("保存" + i);
		i++;
//		System.out.println("account saved");
	}

	public void saveAccount(String email) {

		i++;
//		System.out.println("account saved");
	}
}
