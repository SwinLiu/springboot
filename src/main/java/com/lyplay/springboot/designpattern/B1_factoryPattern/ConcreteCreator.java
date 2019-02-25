package com.lyplay.springboot.designpattern.B1_factoryPattern;

/**
 * 具体工厂类
 * @author Swin.Liu
 *
 */
public class ConcreteCreator extends Creator {

	@Override
	public <T extends Product> T createProduct(Class<T> c) {
		Product product = null;
		try {
			product = (Product) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		return (T) product;
	}

}
