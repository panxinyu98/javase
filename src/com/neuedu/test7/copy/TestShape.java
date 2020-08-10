package com.neuedu.test7.copy;

/*  抽象类 vs 接口
 * 
 * 抽象类： 子类 is a 父类
 * 接口：子类has 接口行为
 * 
 * 
 * 1.抽象类有属性，接口没有属性（可以有常量）
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
 * 抽象类中可以有抽象方法，也可以有非抽象方法
 * 
 * 注意：
 * 1) 抽象类不能new对象, 不完整
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
