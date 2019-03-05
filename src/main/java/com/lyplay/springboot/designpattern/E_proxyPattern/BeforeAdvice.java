package com.lyplay.springboot.designpattern.E_proxyPattern;

/**
 * 通知接口实现
 * 
 * @author Swin.Liu
 *
 */
public class BeforeAdvice {
	public void exec() {
		System.out.println("我是前置通知， 我被执行了！");
	}
}
