package com.dcc.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dcc.service.inter.ServiceLogInter;

/**
 * 切面类，当登录成功后写入日志
 * @author snykt
 *
 */
public class LogAspect {
	@Autowired
	private ServiceLogInter servicelog;
	
	public Object dcc(ProceedingJoinPoint joinPoint) throws Throwable{
		String aa = (String) joinPoint.proceed();
		JSONObject jsonObject = JSON.parseObject(aa);
		if(jsonObject.get("state").equals("1")) {//如果登录成功执行切面
			servicelog.addLog();
		}
		return joinPoint.proceed();//让目标方法执行

	}

}
