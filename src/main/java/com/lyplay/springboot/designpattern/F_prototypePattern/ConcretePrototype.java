package com.lyplay.springboot.designpattern.F_prototypePattern;

public class ConcretePrototype extends Prototype	 {

	@Override
	protected ConcretePrototype clone() throws CloneNotSupportedException {
		return (ConcretePrototype) super.clone();
	}
	
}
