package com.cg.eis.bean;

import javax.naming.InvalidNameException;

//Date 11 Jan 2024
import org.junit.Test;

import com.cg.eis.exception.EmployeeException;

public class CheckException_Junit {

	@Test
	public void test() {
		 try {
	            validateSalary(2500);  
	        } catch (EmployeeException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    private static void validateSalary(double salary) throws EmployeeException {
	        if (salary < 3000) {
	            throw new EmployeeException("Salary cannot be below 3000");
	        }
	      

	    }}



