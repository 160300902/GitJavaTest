package test;

import java.util.Objects;

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
		return (this.id == other.id) && (this.salary == other.salary) && (Objects.equals(this.name, other.name));
	}
	
	public String toString()
	{
		return this.getClass() + " #" + this.getId() + "\t" + this.getName() + "\t" + this.getSalary();
	}
	
	public int compareTo(Employee other)
	{
		return Integer.compare(this.salary, other.salary);
	}
}
