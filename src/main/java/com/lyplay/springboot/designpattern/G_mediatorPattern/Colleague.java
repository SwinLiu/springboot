package com.lyplay.springboot.designpattern.G_mediatorPattern;

/**
 * 抽象同事类
 * @author Swin.Liu
 *
 */
public abstract class Colleague {
	
	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}
	
}
