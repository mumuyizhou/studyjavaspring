package com.heimalearn.studyjava.aspectlog;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ZhouPan
 * @date 2020-07-08
 */

@Order(1)
@Aspect
@Component
public class AspectjLog {
	private static final Logger LOGGER = LoggerFactory.getLogger(AspectjLog.class);

	@Pointcut("execution(* com.heimalearn.studyjava.dao.impl.AccountDaoImpl.*(..))")
	public void logAop() {
	}


	@Before("logAop() ")
	public void logBefore(JoinPoint joinPoint) {
		LOGGER.info("前置通知before{}");
	}

	@AfterReturning("logAop()")
	public void logAfterReturning() {
		LOGGER.info("返回通知afterReturning:{}");
	}

	@AfterThrowing("logAop()")
	public void logAfterThrowing() {
		LOGGER.info("异常通知aferThrowing:{}");
	}

	@Around("logAop() ")
	public Object logAround(ProceedingJoinPoint jp) {
		Object returnObj = null;
		try {
			LOGGER.info("around的前置增强before:{}" );
			jp.proceed();//执行权交给原方法
			LOGGER.info("around的返回增强afterReturning{}" );
		} catch (Throwable t) {
			LOGGER.error("异常抛出:{}", t.getMessage());
		}
		LOGGER.info("around后置增强after:{}");
		return returnObj;
	}
}
