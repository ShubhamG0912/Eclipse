package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void getEmployeeDetails(Employee employee) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        employee.setId(scanner.nextInt());
        scanner.nextLine(); 
        System.out.println("Enter Employee Name: ");
        employee.setName(scanner.nextLine());

        System.out.println("Enter Employee Salary: ");
        employee.setSalary(scanner.nextDouble());

        scanner.nextLine(); // Consume the newline character left by nextDouble()

        System.out.println("Enter Employee Designation: ");
        employee.setDesignation(scanner.nextLine());

        scanner.close();
    }
    @Override
    public void findInsuranceScheme(Employee employee) {
    
        if (employee.getSalary() > 50000) {
            employee.setInsuranceScheme("Platinum");
        } else if (employee.getSalary() > 30000) {
            employee.setInsuranceScheme("Gold");
        } else {
            employee.setInsuranceScheme("Silver");
        }
    }

    @Override
    public void displayEmployeeDetails(Employee employee) {
        System.out.println("\nEmployee Details:\n" + employee.toString());
    }
}
