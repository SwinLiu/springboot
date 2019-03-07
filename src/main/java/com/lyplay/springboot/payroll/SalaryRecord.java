package com.lyplay.springboot.payroll;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SalaryRecord implements ISalaryRecord, Serializable {
	
	private static final long serialVersionUID = -1600043824803100031L;
	
	private BigDecimal salaryAmt;
	private Date salaryEffectDate;
	
	@Override
	public BigDecimal getSalaryAmt() {
		return salaryAmt;
	}
	public void setSalaryAmt(BigDecimal salaryAmt) {
		this.salaryAmt = salaryAmt;
	}
	
	@Override
	public Date getSalaryEffectDate() {
		return salaryEffectDate;
	}
	public void setSalaryEffectDate(Date salaryEffectDate) {
		this.salaryEffectDate = salaryEffectDate;
	}
	
}
