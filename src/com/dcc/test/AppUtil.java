package com.dcc.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppUtil {

	//定义一个私有的对象，不能直接得到，而且是static，向黑板一样。
	private static ApplicationContext ac;
	
	//定义一个私有的构造，不能直接调用
	private AppUtil(){};
	
	//静态代码块，只执行一次
	static{
		System.out.println("执行了");
		ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
	}
	
	//返回ac
	public static ApplicationContext getApplicationContext() {
		return ac;
	}
	
}
