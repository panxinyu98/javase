package com.neuedu.test6;

public class TestLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop t1 = new Laptop();
		Laptop t2 = new Laptop('r',10);
		
		t1.showInfo();
		t2.showInfo();
		
	}

}

class Laptop{
	
	char color;
	int brand;
	
	public Laptop()
	{
		this('g',200);
	}
	
	public Laptop(char color,int brand)
	{
		this.color=color;
		this.brand=brand;
	}
	
	public void showInfo()
	{
		System.out.println("颜色为："+this.color+",型号为："+this.brand);
	}
}