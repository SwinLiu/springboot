package com.lyplay.springboot.designpattern.B2_abstractFactoryPattern;

/**
 * 场景类
 * @author Swin.Liu
 *
 */
public class Client {
	public static void main(String[] args) {
		//定义出两个工厂
		AbstractCreator creator1 = new Creator1();
		AbstractCreator creator2 = new Creator2();
		
		AbstractProductA a1 = creator1.createProductA();
		AbstractProductA a2 = creator2.createProductA();
		
		AbstractProductB b1 = creator1.createProductB();
		AbstractProductB b2 = creator1.createProductB();
	}
}
