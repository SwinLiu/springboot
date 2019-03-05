package com.lyplay.springboot.designpattern.E_proxyPattern;

import java.lang.reflect.Proxy;

/**
 * 动态代理类
 * 
 * @author Swin.Liu
 *
 * @param <T>
 */
public class DynamicProxy<T> {

	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces,
			java.lang.reflect.InvocationHandler h) {
		// 寻找JoinPoint 连接点， AOP框架使用元数据定义
		if (true) {
			// 执行一个前置通知
			(new BeforeAdvice()).exec();
		}
		return (T) Proxy.newProxyInstance(loader, interfaces, h);
	}

}