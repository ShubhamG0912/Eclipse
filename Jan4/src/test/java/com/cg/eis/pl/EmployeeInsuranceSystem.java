package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class EmployeeInsuranceSystem {
    public static void main(String[] args) {
        Employee employee = new Employee();
        EmployeeService employeeService = new EmployeeServiceImpl();

     
        employeeService.getEmployeeDetails(employee);
        
        employeeService.findInsuranceScheme(employee);
       
        employeeService.displayEmployeeDetails(employee);
    }
}