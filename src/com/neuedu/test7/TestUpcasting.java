package com.neuedu.test7;

public class TestUpcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat c = new Cat();
		//向上转型 ->父类引用指向子类对象
		Animal a = new Cat();
		
		//问题->丢失子类特有的属性和方法
		
		//向下转型
		//注意：1.前提是有向上转型 2.必须强制类型转换
		//有什么用：得到子类特有的属性和方法
		Animal b = new Animal();
		Cat c2 = (Cat)a;
		
		//买个小动物
		//向上转型
		Animal ani = buyAnimal();
		//向下转型（先判断类型）
		if(ani instanceof Cat)
		{
			Cat cat = (Cat)ani;
			cat.miao();
		}
		if (ani instanceof Dog)
		{
			Dog dog = (Dog)ani;
			dog.bark();
		}
		
	}
	
	public static Animal buyAnimal()
	{
		return new Cat();
	}
	
	
	
	
	
	

}

class Animal{
	String name;
	
	public void eat(){
		
	}
}

class Cat extends Animal{
	int age;
	public void miao(){
		
	}
}

class Dog extends Animal{
	String bark;
	public void bark()
	{
		
	}
}






