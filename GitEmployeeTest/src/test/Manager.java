package test;

import java.util.*;

public class Manager extends Employee 
{
	private int bonus;
	
	public Manager(String name, int salary, int bonus)
	{
		super(name, salary);
		this.setBonus(bonus);
	}
	
	public Manager(String name, int salary)
	{
		this(name, salary, 6000);
	}
	
	public Manager()
	{
		super();
		this.setBonus(6000);
	}
	
	public void setBonus(int bonus)
	{
		this.bonus = bonus;
	}
	
	public int getBouns()
	{
		return this.bonus;
	}
	
	public int getSalary()
	{
		return super.getSalary() + this.getBouns();
	}
	
	public String toString()
	{
		return this.getClass().getSimpleName() + "\t#" + this.getId() + 
				"\t" + this.getName() + "\t" + this.getSalary() + 
				"(bouns: " + this.getBouns() + ")";
	}
	
	public int compareTo(Manager other)
	{
		return Integer.compare(this.getSalary(), other.getSalary());
	}
	
	public boolean equals(Object otherObj)
	{
		if(this == otherObj)	return true;
		if(otherObj == null)	return false;
		if(this.getClass() != otherObj.getClass())	return false;
		
		Manager other = (Manager)otherObj;
		return (this.getId() == other.getId()) && (this.getSalary() == other.getSalary()) && 
				(Objects.equals(this.getName(), other.getName()) && (this.getBouns() == other.getBouns()));
	}
	
	public static void main(String... strings)
	{
		ArrayList<Manager> employees = new ArrayList<Manager>();
		employees.add(new Manager("Tom", 35000, 2000));
		employees.add(new Manager("Sam", 50000));
		employees.add(new Manager());
		employees.add(new Manager("Bilily", 40000, 10000));
		
		System.out.println("Before sorting the array");
		for(Manager em : employees)
		{
			System.out.println(em);
		}
		Collections.sort(employees);
		System.out.println("\nAfter sorting the array");
		for(Manager em : employees)
		{
			System.out.println(em);
		}
	}
}
