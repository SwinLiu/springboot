package com.lyplay.springboot.payroll.cal;

import java.util.ArrayList;
import java.util.List;

import com.lyplay.springboot.payroll.EmloyeePayrollResult;
import com.lyplay.springboot.payroll.Employee;
import com.lyplay.springboot.payroll.Payitem;
import com.lyplay.springboot.payroll.PayitemResult;
import com.lyplay.springboot.payroll.PayrollPeriod;
import com.lyplay.springboot.payroll.PayrollResult;

public class PayrollMainCal implements Runnable {
	List<Payitem> payitemList = new ArrayList<>();
	List<Employee> employeeList = new ArrayList<>();
	PayrollPeriod payPeriod = new PayrollPeriod();
	private String peid = null;
	
	
	public PayrollResult cal(){
		PayrollResult payrollResult = new PayrollResult();
		payrollResult.setPeid(peid);
		payrollResult.setPayPeriod(payPeriod);
		
		for(Employee employee : employeeList){
			EmloyeePayrollResult employeePayrollResult = new EmloyeePayrollResult();
			employeePayrollResult.setEmployee(employee);
			
			for(Payitem payitem : payitemList){
				PayitemResult payitemResult = new PayitemResult();
				payitemResult.setPayitem(payitem);
				employeePayrollResult.getPayitemResults().add(payitemResult);
			}
			payrollResult.getEmployeePayrollResults().add(employeePayrollResult);
		}
		
		return payrollResult;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		PayrollResult result = cal();
		// do save
		
		// do report
		
		
	}
	
	
	
}
