package com.neuedu.test7;

public class Student {
	
	private String name;
	private int age;
	private String sex;
 
	
	
	public Student()
	{
		
	}
	public Student(String name,int age,String sex)//���s2����Ϣ
	{
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	
	
	//getters(���ֵ����ȡֵ)
	public String getName() {      //���s����Ϣ
		return name;
	}
	//setters(����ֵ����ֵ)
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
