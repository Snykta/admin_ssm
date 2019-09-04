package com.dcc.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppUtil {

	//����һ��˽�еĶ��󣬲���ֱ�ӵõ���������static����ڰ�һ����
	private static ApplicationContext ac;
	
	//����һ��˽�еĹ��죬����ֱ�ӵ���
	private AppUtil(){};
	
	//��̬����飬ִֻ��һ��
	static{
		System.out.println("ִ����");
		ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
	}
	
	//����ac
	public static ApplicationContext getApplicationContext() {
		return ac;
	}
	
}
