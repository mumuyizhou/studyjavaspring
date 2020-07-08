package com.heimalearn.studyjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heimalearn.studyjava.dao.impl.AccountDaoImpl;

/**
 * @author ZhouPan
 * @date 2020-07-08
 */
@RestController
@RequestMapping("/aopctl")
public class AopController {

	private AccountDaoImpl accountDao;
	@Autowired
	public AopController(AccountDaoImpl accountDao) {
		this.accountDao = accountDao;
	}
	@GetMapping("/aop")
	public void getAop(){
		accountDao.saveAccount();
	}

}
