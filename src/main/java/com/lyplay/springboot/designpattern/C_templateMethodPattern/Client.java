package com.lyplay.springboot.designpattern.C_templateMethodPattern;

public class Client {
	
	public static void main(String[] args) {
		AbstractClass template1 = new ConcreteClass1();
		AbstractClass template2 = new ConcreteClass2();
		
		template1.templateMethod();
		template2.templateMethod();
	}
}
