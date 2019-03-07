package com.lyplay.springboot.designpattern.F_prototypePattern;

public abstract class Prototype implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
