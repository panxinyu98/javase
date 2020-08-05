package com.neuedu.test7;

public class Employee {

	public Employee(){
		System.out.println("create father");
	}
	
	public Employee(String name,int age,String department)
	{
		this.age=age;
		this.department=department;
		this.name=name;
	}
	
	public void getDetail()
	{
		System.out.println(this.name+","+this.age+","+this.department );
	}
	
	String name;
	int age;
	String department;
	
	public void work()
	{
		System.out.println("work");
	}
}
