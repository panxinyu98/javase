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
		System.out.println("��Ϊ��" + this.lenght + ",��Ϊ��" + this.width + ",���Ϊ��" + this.getArea() + ",�ܳ�Ϊ��" + this.getPer());

		
	}
	
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(200,100);
		
		r1.showAll();
	}
}
