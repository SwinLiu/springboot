package com.lyplay.springboot.payroll.cal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PayrollExecutorService {
	
	private static ExecutorService fixedThreadPool = Executors.newFixedThreadPool(20);
	
	public static void cal(PayrollMainCal payrollMainCal){
		fixedThreadPool.execute(payrollMainCal);
	}
	
}
