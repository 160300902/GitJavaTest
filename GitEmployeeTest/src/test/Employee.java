package test;

import java.util.Objects;
import java.util.*;

public class Employee implements Comparable<Employee>
{
	private final String name;
	private int salary;
	private int id;
	private static int nextId = 1;
	
	private void setId()
	{
		this.id = nextId;
		nextId++;
	}
	
	public Employee(String name, int salary)
	{
		this.name = name;
		this.salary = salary;
		this.setId();
	}
	
	public Employee()
	{
		this("#"+nextId, 10000);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getSalary()
	{
		return this.salary;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public void setSalary(int newSalary)
	{
		this.salary = newSalary;
	}
	
	public boolean equals(Object otherObj)
	{
		if(this == otherObj)	return true;
		if(otherObj == null)	return false;
		if(this.getClass() != otherObj.getClass())	return false;
		
		Employee other = (Employee)otherObj;
		return (this.getId() == other.getId()) && (this.getSalary() == other.getSalary()) && 
				(Objects.equals(this.getName(), other.getName()));
	}
	
	public String toString()
	{
		return this.getClass().getSimpleName() + "#" + this.getId() + 
				"\t" + this.getName() + "\t" + this.getSalary();
	}
	
	public final int compareTo(Employee other)
	{
		return Integer.compare(this.getSalary(), other.getSalary());
	}
	
	public static void main(String... strings)
	{
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Tom", 35000));
		employees.add(new Employee("Sam", 50000));
		employees.add(new Employee());
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
