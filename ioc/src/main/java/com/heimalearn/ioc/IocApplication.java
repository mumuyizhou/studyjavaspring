package com.heimalearn.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.heimalearn.ioc.dao.IAccountDao;
import com.heimalearn.ioc.service.IAccountService;

//@SpringBootApplication
public class IocApplication {
	/**
	 * 获取spring的Ioc核心容器，并根据id获取对象
	 * ApplicationContext的三个常用实现类，
	 * ClassPathXmlApplicationContext:可以加载类路径下的配置文件，要求配置文件必须在类路径下
	 * FileSystemXmlApplicationContext:可以加载任意路径下的配置文件（必须有访问权限)
	 * AnnotationConfigApplicationContext:用于读取注解创建容器的
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		/*获取核心容器对象*/
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*根据id获取bean对象*/
		IAccountService as = (IAccountService) context.getBean("accountService");
		IAccountDao adao = context.getBean("accountDao", IAccountDao.class);
		System.out.println(as);
		System.out.println(adao);
	}
}
