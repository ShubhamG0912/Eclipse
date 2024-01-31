package com.cg.eis.bean;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;
    private String insuranceScheme;
    private int age;

    // Constructors, getters, and setters

    @Override
    public String toString() {
        return "Employee ID: " + id +
                "\nName: " + name +
                "\nSalary: " + salary +
                "\nDesignation: " + designation +
                "\nInsurance Scheme: " + insuranceScheme;
    }

	public Employee() {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

	public void setAge(int i) {
		// TODO Auto-generated method stub
		
	}


}