package com.lyplay.springboot.payroll;

import java.math.BigDecimal;
import java.util.Date;

public interface ISalaryRecord {
	
	public BigDecimal getSalaryAmt();

	public Date getSalaryEffectDate();
	
}
