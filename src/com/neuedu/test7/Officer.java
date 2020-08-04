package com.neuedu.test7;

public class Officer extends Employee{

	public Officer(){
		//调用父类构造方法
		//super();调用父类无参的构造方法，默认编译器会加上，必须在构造器里的第一句话
		//this(100);
		
		System.out.println("Officer");
	}
	//super 和 this什么时候会有区别.
	//super:调用父类的name    this：调用自己的name
	
	public Officer(double vehicleAllowance)
	{
		//super();
		this.vehicleAllowance=vehicleAllowance;
	}
	
	
	public void work()
	{
		System.out.println("public worker");
	}
	
	public void test()
	{
		//super 在子类里使用，代表父类对象
		
		System.out.println(super.department+","+super.age+","+super.name);
		//调用当前对象的work方法
		this.work();
		//调用父类的work方法
		super.work();
		
	}
	
	double vehicleAllowance;
	public double getVehicleAllowance()
	{
		return this.vehicleAllowance;
		
		
	}
	
	public static void main(String[] args) {
		//创建一个子类对象
		Officer o=new Officer();
		o.name="xiao hong";
		o.age=18;
		o.department="research";
		o.vehicleAllowance=200;
		
		o.work ();
		o.getVehicleAllowance();
		o.test();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
