package com.lyplay.springboot.designpattern.C_templateMethodPattern;

/**
 * 抽象模板类
 * @author Swin.Liu
 *
 */
public abstract class AbstractClass {

	/**
	 * 基本方法
	 */
	protected abstract void doSomething();
	
	/**
	 * 基本方法
	 */
	protected abstract void doAnything();
	
	/**
	 * 模板方法
	 */
	public final void templateMethod(){
		/**
		 * 调用基本方法，完成相关的逻辑
		 */
		this.doAnything();
		this.doSomething();
	}
	
}
