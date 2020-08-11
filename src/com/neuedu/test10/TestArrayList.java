package com.neuedu.test10;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//变长
		//引用数据类型
		//List放重复的
		ArrayList list = new ArrayList();
		list.add("aa");
		list.add("bb");
		list.add("aa");
		
		System.out.println(list.get(0));//aa
		System.out.println(list.get(1));//bb
		System.out.println(list.get(2));//aa
		
		System.out.println(list.size());//得到集合的长度
		
		for(int i=0;i<list.size();i++)
		{
			Object o = list.get(i);
			String str = (String)o;
			System.out.println(str);
		}
		
		Integer a = 10;//自动装箱
		 
		int b = a;//自动拆箱
		
		ArrayList list2 = new ArrayList();
		list2.add(1);//自动装箱
		list2.add(2);
		list2.add(3);
		
		for(int i=0;i<list2.size();i++)
		{
			Object o = list2.get(i);
			System.out.println(o);
		}
	}

}
