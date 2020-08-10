package com.neuedu.test9;

public class TestString {

	//字符串是不可变序列                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="hello";
		String str2=new String("hello");
		String str3 = "hello";
		
		System.out.println(str1==str2);//false
		System.out.println(str1==str3);//true
		
		str3 = "hello you";
		System.out.println(str1==str3);//false
		
		
		char[] arr={'a','b','c','d'};
		String str4 = new String(arr);
		System.out.println(str4);
		
		
		
		
	}

}
