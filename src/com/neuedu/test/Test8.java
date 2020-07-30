package com.neuedu.test;

public class Test8 {
public static void main(String[] args) {
	
	//赋值运算
	
	int a=100;
	int b=a;
	b+=a;
	b-=a;
	b*=a;
	b/=a;
	System.out.println(b);
	//关系运算
	//> >= < <= == !=
	//关系运算的结果是boolean
	
	System.out.println(a>b);//true
	boolean flag =a!=b;//false
	
	
	boolean x=true;
	boolean y=false;
	System.out.println(x&&y);//全为true，则为true
	System.out.println(x||y);//一个为true，就是true
	System.out.println(!x);
	System.out.println(!y);
	System.out.println(x^y);//相同为false，不同为true
	
	int a1=100;
	int b1=200; 
	int c1=300;
	//短路运算
	boolean flag1=a1>b1 && b1++<c1;
	System.out.println(b1);
	
	boolean flag2=a1<b1 || b1++>c1;
	System.out.println(b1);
	
	// &,|不短路
	
	int x1=200;
	int y1=300;
	int z1=400;
	
	boolean cc= x1>y1 & y1++<z1 ;
	System.out.println(y1);
	
	System.out.println("---------------------");
	
	//三元运算符
	char sex='f';
	String str =sex =='f'?"女":"男";
	System.out.println(str);
	
	int xx=10;
	int yy=20;
	int zz=30;
	int max= xx>yy?xx:yy;
	max= max>=zz?max:zz;

	
	
	System.out.println(max);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
