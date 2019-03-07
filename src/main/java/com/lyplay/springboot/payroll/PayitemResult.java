package com.lyplay.springboot.payroll;

import java.math.BigDecimal;

public class PayitemResult {
	
	private Payitem payitem;
	private BigDecimal payitemAmt;
	
	public Payitem getPayitem() {
		return payitem;
	}
	public void setPayitem(Payitem payitem) {
		this.payitem = payitem;
	}
	public BigDecimal getPayitemAmt() {
		return payitemAmt;
	}
	public void setPayitemAmt(BigDecimal payitemAmt) {
		this.payitemAmt = payitemAmt;
	}
	
	
}
