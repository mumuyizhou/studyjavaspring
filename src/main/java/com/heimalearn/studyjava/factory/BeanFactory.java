package com.heimalearn.studyjava.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author ZhouPan
 * @date 2020-01-08
 */
public class BeanFactory {
	private static Properties props;
	private static Map<String, Object> beans;
	static {
		props = new Properties();
		try {
			InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
			props.load(in);
			beans = new HashMap<>();
			Enumeration<Object> keys = props.keys();
			while (keys.hasMoreElements()) {
				String key = keys.nextElement().toString();
				String beanPath = props.getProperty(key);
				Object value = Class.forName(beanPath).newInstance();
				beans.put(key, value);
			}
		} catch (Exception e) {
			throw new ExceptionInInitializerError("初始化properties失败");
		}
	}
	public static Object getBean(String beanName) {
		return beans.get(beanName);
	}
}
