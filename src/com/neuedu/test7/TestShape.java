package com.neuedu.test7;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//创建一个square的对象
		Square s = new Square();
		s.setBianchang(10);
		System.out.println(s.getArea());
		
		Cricle c = new Cricle();
		c.setRadius(10);
		System.out.println(c.getArea());

	}

}
class Shape{
	public double getArea()
	{
		return 0;
	}
}

class Square extends Shape{

	private int bianchang;
	
	
	public int getBianchang() {
		return bianchang;
	}


	public void setBianchang(int bianchang) {
		this.bianchang = bianchang;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.bianchang * this.bianchang;		
	}
	
}

class Cricle extends Shape{

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	

	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14 * this.radius * this.radius;
	}
	
}