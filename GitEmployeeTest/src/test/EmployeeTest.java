package test;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest
{
	public static void main(String... strings)
	{
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Tom", 35000));
		employees.add(new Manager("Sam", 50000));
		employees.add(new Manager());
		employees.add(new Employee("Bilily", 40000));
		
		System.out.println("Before sorting the array");
		for(Employee em : employees)
		{
			System.out.println(em);
		}
		Collections.sort(employees);
		System.out.println("\nAfter sorting the array");
		for(Employee em : employees)
		{
			System.out.println(em);
		}
	}
}
