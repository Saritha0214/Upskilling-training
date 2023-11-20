package com.oops;

import java.util.ArrayList;

public class Employee {
	long salary = 30000;
	public int getSalary(int salary) {
		this.salary=salary;
		return salary;
	}
	public static int totalEmploeesSalary(ArrayList<Integer> employeeSalaries) {
		int totalSal=0;
		for (int sal:employeeSalaries) {
			totalSal+=sal;
		}
		return totalSal;
	}
	public static void main(String[] args) {
		Employee employee=new Employee();
		Manager manager=new Manager();
		long managerSalary=manager.getSalary(employee.salary);
		Labour labour=new Labour();
		long labourSalary=labour.getSalary(employee.salary);
		ArrayList<Integer> employeeSalaryList=new ArrayList<>();
		employeeSalaryList.add((int) managerSalary);
		employeeSalaryList.add((int) labourSalary);
		System.out.println(Employee.totalEmploeesSalary(employeeSalaryList));
	}
}
class Manager extends Employee{
	public long getSalary(long salary) {
		int incentive=4000;
		return salary+incentive;
	}
}
class Labour extends Employee {
	public long getSalary(long salary) {
		int overtime=1000;
		return salary+overtime;
	}
}