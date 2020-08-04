package com.neuedu.test6;

public class Point {

	int x;
	int y;
	
  	public Point()
	{
		this(10,10);

	}
	
	public Point(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void movePoint(int dx,int dy)
	{
		this.x = dx;
		this.y = dy;
	}
	
	public static void main(String[] args) {
		
		//调用无参构造方法，默认位置10，10

		Point p1 = new Point();
		p1.movePoint(10,10);
		
		Point p2=new Point();
		p2.movePoint(200,200);
		
		System.out.println(p1.x +"," + p1.y);
		System.out.println(p2.x +"," + p2.y);

		
	}
	
}
