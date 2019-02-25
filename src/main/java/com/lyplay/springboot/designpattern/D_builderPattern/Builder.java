package com.lyplay.springboot.designpattern.D_builderPattern;

/**
 * 抽象建造者类
 * @author Swin.Liu
 *
 */
public abstract class Builder {

	/**
	 * 设置产品的不同部分，以获得不同的产品
	 */
	public abstract void setPart();
	
	/**
	 * 建造产品
	 * @return
	 */
	public abstract Product buildProduct();
	
}
