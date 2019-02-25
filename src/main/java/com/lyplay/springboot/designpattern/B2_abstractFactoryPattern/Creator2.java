package com.lyplay.springboot.designpattern.B2_abstractFactoryPattern;

/**
 * 产品工厂2的实现类
 * @author Swin.Liu
 *
 */
public class Creator2 extends AbstractCreator {

	/**
	 * 只生产产品等级2的A产品
	 */
	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	/**
	 * 只生产产品等级2的B产品
	 */
	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
