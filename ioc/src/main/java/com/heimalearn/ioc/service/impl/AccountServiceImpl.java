package com.heimalearn.ioc.service.impl;

import com.heimalearn.ioc.dao.IAccountDao;
import com.heimalearn.ioc.dao.impl.AccountDaoImpl;
import com.heimalearn.ioc.service.IAccountService;

/**
 * @author ZhouPan
 * @date 2020-01-08
 */
public class AccountServiceImpl implements IAccountService {
	private IAccountDao accountDao = new AccountDaoImpl();

	@Override
	public void saveAccount() {
		accountDao.saveAccount();
	}
}
