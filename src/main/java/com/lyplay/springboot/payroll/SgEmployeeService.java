package com.lyplay.springboot.payroll;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(1)
@Component
public class SgEmployeeService implements IEmployeeService {
	private String type = "SgEmployeeService";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
