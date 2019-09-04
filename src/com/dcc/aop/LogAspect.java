package com.dcc.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dcc.service.inter.ServiceLogInter;

/**
 * �����࣬����¼�ɹ���д����־
 * @author snykt
 *
 */
public class LogAspect {
	@Autowired
	private ServiceLogInter servicelog;
	
	public Object dcc(ProceedingJoinPoint joinPoint) throws Throwable{
		String aa = (String) joinPoint.proceed();
		JSONObject jsonObject = JSON.parseObject(aa);
		if(jsonObject.get("state").equals("1")) {//�����¼�ɹ�ִ������
			servicelog.addLog();
		}
		return joinPoint.proceed();//��Ŀ�귽��ִ��

	}

}
