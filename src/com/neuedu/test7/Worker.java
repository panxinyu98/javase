package com.neuedu.test7;

public class Worker extends Employee{
	
         
          
	double dressAllowance;
	

	public double getDressAllowance()
	{
		return this.dressAllowance;
	}
	
	public static void main(String[] args) {
		//����һ������
		Worker w=new Worker();
		w.name="xiao hong";
		w.age=18;
		w.department="research";
		
	}
	
	
	
	
	
	
	
	
}
