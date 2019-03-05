package com.lyplay.springboot.payroll;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(2)
@Component
public class HkEmployeeService implements IEmployeeService {
	private String type = "HkEmployeeService";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
