package com.neuedu.test7;

public class Student {
	
	private String name;
	private int age;
	private String sex;
 
	
	
	public Student()
	{
		
	}
	public Student(String name,int age,String sex)//输出s2的信息
	{
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	
	
	//getters(输出值，获取值)
	public String getName() {      //输出s的信息
		return name;
	}
	//setters(输入值、赋值)
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
			this.age = age;
		
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
	
}
