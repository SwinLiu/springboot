package com.lyplay.springboot.designpattern.E_proxyPattern;

import java.lang.reflect.InvocationHandler;

/**
 * 具体业务的动态代理类
 * 
 * @author Swin.Liu
 *
 * @param <T>
 */
public class SubjectDynamicProxy extends DynamicProxy {

	public static <T> T newProxyInstance(Subject subject) {
		ClassLoader loader = subject.getClass().getClassLoader();
		Class<?>[] classes = subject.getClass().getInterfaces();
		InvocationHandler handler = new MyInvocationHandler(subject);
		return newProxyInstance(loader, classes, handler);
	}

}