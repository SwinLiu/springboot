package com.lyplay.springboot.payroll;

import java.util.ArrayList;
import java.util.List;

public class EmloyeePayrollResult {
	Employee employee = new Employee();
	
	List<PayitemResult> payitemResults = new ArrayList<>();

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<PayitemResult> getPayitemResults() {
		return payitemResults;
	}

	public void setPayitemResults(List<PayitemResult> payitemResults) {
		this.payitemResults = payitemResults;
	}
	
	
}
