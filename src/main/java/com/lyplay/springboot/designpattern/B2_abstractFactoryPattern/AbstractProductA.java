package com.lyplay.springboot.designpattern.B2_abstractFactoryPattern;

/**
 * 抽象产品类A
 * @author Swin.Liu
 *
 */
public abstract class AbstractProductA {
	
	/**
	 * 每个产品的共有方法 
	 */
	public void shareMethod(){
		
	}
	
	/**
	 * 每个商品相同的方法，不同的实现
	 */
	public abstract void doSomething();
	
}
