package com.lyplay.springboot.designpattern.B1_factoryPattern;

/**
 * 抽象工厂类
 * @author Swin.Liu
 *
 */
public abstract class Creator {
	/**
	 * 创建一个产品对象， 其输入参数类型可以自行设置
	 * 通常为String,Enum,Class等， 当然也可以为空
	 * @param c
	 * @return
	 */
	public abstract <T extends Product> T createProduct(Class<T> c);
}
