package com.neuedu.test7;

import java.util.Scanner;

public class TestFruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Fruit f = growFruit(num);
		if(f!=null)
		{
		f.eat();//触发了多态
		}
	}
	//返回值多态
	public static Fruit growFruit(int num)
	{
		if(num==1)
		{
			return new Apple();
		}
		else if(num==2)
		{
			return new Banana();
		}
		return null;
		
	}

}
class Fruit{
	
	public void eat()
	{
		
	}
}
class Apple extends Fruit{

	@Override
	public void eat() {
		
		System.out.println("cui");
	}

}

class Banana extends Fruit{
	@Override
	public void eat() {
		System.out.println("tian");
	}
	
}







