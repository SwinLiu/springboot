package com.lyplay.springboot.designpattern.B2_abstractFactoryPattern;

/**
 * 抽象工厂类
 * @author Swin.Liu
 *
 */
public abstract class AbstractCreator {

	/**
	 * 创建A产品家族
	 * @return
	 */
	public abstract AbstractProductA createProductA();
	
	/**
	 * 创建B产品家族
	 * @return
	 */
	public abstract AbstractProductB createProductB();
	
	/**
	 * 注意： 有N个产品族，在抽象工厂类中就该有N个创建方法。
	 */
	
}
