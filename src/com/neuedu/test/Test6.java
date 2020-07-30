package com.neuedu.test;

public class Test6 {
public static void main(String[] args) {
	
	//a是目标类型
	double a=100;
	int x=100;
	
	//隐式类型转换
	long y=200;
	
	double z=1234;
	
	//在数学运算时，也有类型转换
	System.out.println(x+y+z);
	
	 int i=129;
	 byte j=(byte)i;
	 System.out.println(j);//数据溢出3
	 
	 char c='a';
	 int k=c;
	 System.out.println(k);
	 
	 int kk=97;
	 char cc=(char)kk;
	 System.out.println(cc);
	 
	 long xx=88;
	 int yy=(int)xx;
	 
	 
	 
}
}
