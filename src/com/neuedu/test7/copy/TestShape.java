package com.neuedu.test7.copy;

/*  ������ vs �ӿ�
 * 
 * �����ࣺ ���� is a ����
 * �ӿڣ�����has �ӿ���Ϊ
 * 
 * 
 * 1.�����������ԣ��ӿ�û�����ԣ������г�����
 * 
 * 
 * 
 * 
 * */

public class TestShape {
	
	public static void main(String[] args) {
		
		//Shape s = new Shape();
		
		//Circle c = new Circle();
		
		//Shape.test(); 
		Child c = new Child();
		c.getArea();
	}

}


/*
 * �������п����г��󷽷���Ҳ�����зǳ��󷽷�
 * 
 * ע�⣺
 * 1) �����಻��new����, ������
 * 
 * */
interface Shape{
	
	public abstract double getArea();
	
	public abstract double getPer();
	
	default void test()
	{
		
	}	
} 

 class Circle implements Shape{
	
	int radius;

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14 * this.radius * this.radius;
	}

	@Override
	public  double getPer(){
		return 2*3.14*this.radius;
	}
	@Override
	public  void test(){
		Shape.super.test();
	}
	
	
}
class Child extends Circle{

	@Override
	public double getPer() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
