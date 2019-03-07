package com.lyplay.springboot.payroll;

import java.util.ArrayList;
import java.util.List;

public class PayrollResult {
	String peid;
	PayrollPeriod payPeriod = new PayrollPeriod();
	List<EmloyeePayrollResult> employeePayrollResults = new ArrayList<>();
	
	public String getPeid() {
		return peid;
	}
	public void setPeid(String peid) {
		this.peid = peid;
	}
	public PayrollPeriod getPayPeriod() {
		return payPeriod;
	}
	public void setPayPeriod(PayrollPeriod payPeriod) {
		this.payPeriod = payPeriod;
	}
	public List<EmloyeePayrollResult> getEmployeePayrollResults() {
		return employeePayrollResults;
	}
	public void setEmployeePayrollResults(List<EmloyeePayrollResult> employeePayrollResults) {
		this.employeePayrollResults = employeePayrollResults;
	}
	
	
	
}
