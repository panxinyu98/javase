package com.neuedu.test7;

public class Officer extends Employee{

	public Officer(){
		//���ø��๹�췽��
		//super();���ø����޲εĹ��췽����Ĭ�ϱ���������ϣ������ڹ�������ĵ�һ�仰
		//this(100);
		
		System.out.println("Officer");
	}
	//super �� thisʲôʱ���������.
	//super:���ø����name    this�������Լ���name
	
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
		//super ��������ʹ�ã����������
		
		System.out.println(super.department+","+super.age+","+super.name);
		//���õ�ǰ�����work����
		this.work();
		//���ø����work����
		super.work();
		
	}
	
	double vehicleAllowance;
	public double getVehicleAllowance()
	{
		return this.vehicleAllowance;
		
		
	}
	
	public static void main(String[] args) {
		//����һ���������
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
