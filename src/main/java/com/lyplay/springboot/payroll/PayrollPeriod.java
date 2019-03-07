package com.lyplay.springboot.payroll;

import java.util.Date;

public class PayrollPeriod {
	private int payyear;
	private int paymonth;
	private Date periodStartDay;
	private Date periodEndDay;
	
	public int getPayyear() {
		return payyear;
	}
	public void setPayyear(int payyear) {
		this.payyear = payyear;
	}
	public int getPaymonth() {
		return paymonth;
	}
	public void setPaymonth(int paymonth) {
		this.paymonth = paymonth;
	}
	public Date getPeriodStartDay() {
		return periodStartDay;
	}
	public void setPeriodStartDay(Date periodStartDay) {
		this.periodStartDay = periodStartDay;
	}
	public Date getPeriodEndDay() {
		return periodEndDay;
	}
	public void setPeriodEndDay(Date periodEndDay) {
		this.periodEndDay = periodEndDay;
	}
	
}
