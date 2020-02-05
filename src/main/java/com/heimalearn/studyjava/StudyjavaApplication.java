package com.heimalearn.studyjava;

import javax.xml.ws.Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.heimalearn.studyjava.dao.IAccountDao;
import com.heimalearn.studyjava.factory.BeanFactory;
import com.heimalearn.studyjava.service.IAccountService;

@SpringBootApplication
public class StudyjavaApplication {

	public static void main(String[] args) {
//		SpringApplication.run(StudyjavaApplication.class, args);
		for (int i = 0; i < 5; i++) {
			IAccountService iAccount = (IAccountService) BeanFactory.getBean("accountService");
			System.out.println(iAccount);
			iAccount.saveAccount();
		}
	}

}
