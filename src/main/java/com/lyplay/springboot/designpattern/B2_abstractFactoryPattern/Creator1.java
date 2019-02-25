package com.lyplay.springboot.designpattern.B2_abstractFactoryPattern;

/**
 * 产品工厂1的实现类
 * @author Swin.Liu
 *
 */
public class Creator1 extends AbstractCreator {

	/**
	 * 只生产产品等级1的A产品
	 */
	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	/**
	 * 只生产产品等级1的B产品
	 */
	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
