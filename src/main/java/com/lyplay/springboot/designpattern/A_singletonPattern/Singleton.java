package com.lyplay.springboot.designpattern.A_singletonPattern;

/**
 * Singleton Pattern
 * Ensure a class has only one instance, and provide a global point of access to it
 * 确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例
 * @author Swin.Liu
 *
 */
public class Singleton {
	
	private static final Singleton singleton = new Singleton();
	
	/**
	 * 限制产生多个对象
	 */
	private Singleton(){}
	
	/**
	 * 通过该方法获得实例对象
	 * @return
	 */
	public static Singleton getSingleton(){
		return singleton;
	}
	
	/**
	 * 类中其他方法，尽量是static
	 */
	public static void doSomething(){
		// TODO
	}
	
}
