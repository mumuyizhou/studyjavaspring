package com.heimalearn.ioc.dao.impl;


import com.heimalearn.ioc.dao.IAccountDao;

/**
 * @author ZhouPan
 * @date 2020-01-08
 */
public class AccountDaoImpl implements IAccountDao {
	@Override
	public void saveAccount(){
		int i = 1;
		System.out.println(i);
		i++;
//		System.out.println("account saved");
	}
}
