package com.neuedu.test7;

public class TestVehicle {
    public static void main(String[] args) {
		Car volvo = new Car("Œ÷∂˚Œ÷","black",5,300000);
		System.out.println(volvo.brand);
		System.out.println(volvo.color);
		System.out.println(volvo.loader);
		System.out.println(volvo.price);

    	
	}
}

class Vehicle {
	String brand;
	String color;
	int loader;
	
	public Vehicle(String brand,String color,int loader)
	{
		this.brand=brand;
		this.color=color;
		this.loader=loader;
	}
}

class Car extends Vehicle{
	double price;
	public Car(String brand,String color,int loader,double price)
	{
		super(brand,color,loader);
		this.price=price;
		
		
	}
	
}