package com.cg.eis.bean;

import com.cg.eis.exception.EmployeeException;

public class YourMainClass {
    public static void main(String[] args) {
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
      
    }
}
