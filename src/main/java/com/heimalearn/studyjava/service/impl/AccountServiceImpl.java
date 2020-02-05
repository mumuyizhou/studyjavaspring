package com.heimalearn.studyjava.service.impl;

import com.heimalearn.studyjava.dao.IAccountDao;
import com.heimalearn.studyjava.factory.BeanFactory;
import com.heimalearn.studyjava.service.IAccountService;

/**
 * @author ZhouPan
 * @date 2020-01-08
 */
public class AccountServiceImpl implements IAccountService {
	private IAccountDao accountDao = (IAccountDao) BeanFactory.getBean("accountDao");
	@Override
	public void saveAccount(){
		accountDao.saveAccount();
	}
}
