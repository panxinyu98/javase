package com.neuedu.test7.copy;

import java.util.Scanner;

public class Grandener {

	public static void main(String[] args) {		
		while(true)
		{
			Scanner sc = new Scanner(System.in);			
			String str = sc.nextLine();		
			if(str.equals("exit"))
			{
				break;
			}		
			Fruit f = growFruit(str);
			if(f !=null)
			{
				f.showInfo();
			}
		}
	}	
	public static Fruit growFruit(String str)
	{	
		switch(str)
		{
		case "a":
			return new Apple();
		case "b":
			return new Banana();
		case "g":
			return new Grape();
		default:
			return null;
		}
	}

}

interface Fruit
{
	public void showInfo();
}

class Apple implements Fruit{

	@Override
	public void showInfo() {
		
		System.out.println("apple");
	}	
}

class Banana implements Fruit{

	@Override
	public void showInfo() {
		
		System.out.println("banana");
	}	
}

class Grape implements Fruit{

	@Override
	public void showInfo() {
		
		System.out.println("grape");
	}	
}
