package com.neuedu.test6;

public class Rectangle {

	int lenght;
	int width;
	
	public Rectangle(int lenght,int width)
	{
		this.lenght = lenght;
		this.width = width;
	}
	
	public int getArea()
	{
		return this.lenght * this.width;
		
	}
	
	public int getPer()
	{
		return (this.lenght + this.width)*2;
		
	}
	public void showAll()
	{
		System.out.println("长为：" + this.lenght + ",宽为：" + this.width + ",面积为：" + this.getArea() + ",周长为：" + this.getPer());

		
	}
	
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(200,100);
		
		r1.showAll();
	}
}
