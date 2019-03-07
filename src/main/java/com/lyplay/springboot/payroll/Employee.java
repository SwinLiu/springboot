package com.lyplay.springboot.payroll;

import java.util.Date;
import java.util.List;

public class Employee {

	private String empId;
	private String name;
	private Date dob;
	private Date hireDate;
	private List<ISalaryRecord> salaryRecords;
	private IBankCard bankCard;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public List<ISalaryRecord> getSalaryRecords() {
		return salaryRecords;
	}
	public void setSalaryRecords(List<ISalaryRecord> salaryRecords) {
		this.salaryRecords = salaryRecords;
	}
	public IBankCard getBankCard() {
		return bankCard;
	}
	public void setBankCard(IBankCard bankCard) {
		this.bankCard = bankCard;
	}
	
}
