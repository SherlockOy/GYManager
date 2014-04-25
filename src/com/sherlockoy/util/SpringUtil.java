package com.sherlockoy.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil {
	private static ApplicationContext context = new ClassPathXmlApplicationContext(
			new String("ApplicationContext.xml"));

	public static ApplicationContext getContext() {
		return context;
	}

}
