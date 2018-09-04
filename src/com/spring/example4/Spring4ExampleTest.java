package com.spring.example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring4ExampleTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee = (Employee)context.getBean("employeeBean");
		employee.setEmpname("Tarun");
		employee.setDepartment("Java Programmer");
		employee.setSalary(50000000);
		System.out.println(employee.toString());
		
		Employee employee1 = (Employee)context.getBean("employeeBean");
		System.out.println(employee1.toString());
	}
}
