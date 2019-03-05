package com.lyplay.springboot.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lyplay.springboot.payroll.HkEmployeeService;
import com.lyplay.springboot.payroll.IEmployeeService;
import com.lyplay.springboot.payroll.SgEmployeeService;

@RestController
@EnableAutoConfiguration
public class HomeController {

	@Autowired
	List<IEmployeeService> empList;
	
	@RequestMapping("/")
	String home() {
		return "Hello Swin!";
	}
	
	@RequestMapping("/test/list")
	String testList() {
		StringBuffer sb = new StringBuffer();
		for(IEmployeeService emp : empList){
			if (emp instanceof SgEmployeeService) {
				SgEmployeeService sgEmp = (SgEmployeeService) emp;
				sb.append(sgEmp.getType());
			} else if (emp instanceof HkEmployeeService) {
				HkEmployeeService hkEmp = (HkEmployeeService) emp;
				sb.append(hkEmp.getType());
			}
			
		}
		return sb.toString();
	}
	
}
