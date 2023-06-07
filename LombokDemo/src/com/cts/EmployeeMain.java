package com.cts;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cts.model.Employee;

import lombok.extern.slf4j.Slf4j;

//@Slf4j
public class EmployeeMain {
	static Logger LOGGER = LoggerFactory.getLogger(EmployeeMain.class);

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Employee emp = new Employee(101, "Priyanshi", "priya@gmail.com");
//		 System.out.println(emp);
		LOGGER.info("Employee={}", emp);
		LOGGER.info("{} is my name",emp.getName());
//		LOGGER.info("hii...........................");
		LOGGER.warn("Warning");
		LOGGER.error("Error");

	}

}
