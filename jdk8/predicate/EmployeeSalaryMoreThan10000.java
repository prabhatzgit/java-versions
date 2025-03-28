package jdk8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeSalaryMoreThan10000 {

	String name;
	int salary;

	// public constructor
	public EmployeeSalaryMoreThan10000(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		List<EmployeeSalaryMoreThan10000> employees = new ArrayList<>();
		// adding few employees to list
		employees.add(new EmployeeSalaryMoreThan10000("Arjun", 16500));
		employees.add(new EmployeeSalaryMoreThan10000("Nambi", 5600));
		employees.add(new EmployeeSalaryMoreThan10000("Sankar", 90500));
		employees.add(new EmployeeSalaryMoreThan10000("Vineet", 9700));
		employees.add(new EmployeeSalaryMoreThan10000("Madhu", 10500));

		// lambda expression to check employee salary is greater than 10000 using
		// Predicate FI
		Predicate<EmployeeSalaryMoreThan10000> p = emp -> emp.salary > 10000;

		// testing number using Predicate
		for (EmployeeSalaryMoreThan10000 employee : employees) {
			System.out.println("Whether '" + employee.name + "' has salary more than 10000 : \t" + p.test(employee));

		}
	}
}