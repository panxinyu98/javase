package com.neuedu.test7.copy;

public class Chinese {
    //静态
	String name;
	static String country;
	int age;
	
	/*类加载到内存自动执行
	 * 
	 * 类什么时候被加载到内存：
	 * 1.Chinese.属性/方法
	 * 2.Chinese c=new Chinese();
	 * 
	 * 执行顺序：
	 * 1.静态代码块
	 * 2.构造方法
	 * 
	 * 
	 * 作用：给static的属性赋初值
	 * 
	 * */
	static{
		country = "中国";
		System.out.println("static");
	}
	
	//普通代码块
	{
		System.out.println("hahaah");
	}
	
	public Chinese()
	{
		System.out.println("constructor");
	}
	
	public Chinese(String name,int age)
	{
		this.name = name;
		this.age = age;
		System.out.println("constructor");
	}
	
	/* 注意：
	 *   static 的方法里只能访问static的属性
	 *   static 的方法里不能写this,super
	 * 什么方法应该定义static：方法里没有对象属性，都可以考虑成定义静态的
	 * 定义静态的好处：调用的时候，直接用 类名.方法 就可以
	 * */
	
	public static void showInfo()
	{
		System.out.println(country);
	}
	
	public void showName()
	{
		//可以访问static
	   System.out.println(name );	
	   System.out.println(country);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chinese c1 = new Chinese();
		c1.name = "xx";
		Chinese.country = "中国";
		c1.age =20;
		
		Chinese c2 = new Chinese();
		
		c2.country = "中华人民共和国";
        //System.out.println(Chinese.country);

		showInfo();
	}

}
