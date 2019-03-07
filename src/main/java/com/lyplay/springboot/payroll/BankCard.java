package com.lyplay.springboot.payroll;

import java.io.Serializable;

public class BankCard implements IBankCard, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5548056545194550508L;
	private String bankCode;
	private String bankCardNo;
	private String bankCardOwner;
	
	@Override
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	@Override
	public String getBankCardNo() {
		return bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	
	@Override
	public String getBankCardOwner() {
		return bankCardOwner;
	}
	public void setBankCardOwner(String bankCardOwner) {
		this.bankCardOwner = bankCardOwner;
	}
	
}
