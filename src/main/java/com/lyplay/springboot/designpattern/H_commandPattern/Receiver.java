package com.lyplay.springboot.designpattern.H_commandPattern;

public abstract class Receiver {
	
	public abstract void doSomething();
	
}

class ConcreteReceiver1 extends Receiver{

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
	}
	
}

class ConcreteReceiver2 extends Receiver{

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
	}
	
}