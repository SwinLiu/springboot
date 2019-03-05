package com.lyplay.springboot.designpattern.E_proxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的Handler类
 * @author Swin.Liu
 *
 */
public class MyInvocationHandler implements InvocationHandler {

	private Object target = null;

	public MyInvocationHandler(Object obj) {
		this.target = obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
		return method.invoke(this.target, args);
	}
	
}
