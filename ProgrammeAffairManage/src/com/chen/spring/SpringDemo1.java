package com.chen.spring;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringDemo1 {
	@Test
	public void demo1(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		context.start();
		AccountService accountService = (AccountService) context.getBean("accountService");
		accountService.transfer("bbb", "aaa", 200);
	}

}
