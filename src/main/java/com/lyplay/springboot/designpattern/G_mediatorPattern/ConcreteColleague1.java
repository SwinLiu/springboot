package com.lyplay.springboot.designpattern.G_mediatorPattern;

/**
 * 具体同事类
 * @author Swin.Liu
 *
 */
public class ConcreteColleague1 extends Colleague {

	/**
	 * 通过构造函数传递中介者
	 * @param mediator
	 */
	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	
	/**
	 * 自有方法
	 */
	public void selfMethod1(){
		// 处理自己的业务逻辑
	}
	
	public void depMethod1(){
		//处理自己的业务逻辑
		//自己不能处理的业务逻辑， 委托中介者处理
		super.mediator.doSomething1();
	}
	
}
