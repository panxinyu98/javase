package com.neuedu.test4;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//将一个数组中的内复制到另一个数组
		char[] cs={'n','e','u','e','d','u'};
		char[] copy= new char[cs.length ];
		
		for(int i=0;i<cs.length ;i++)
		{
			copy[i] = cs[i];
		}
		//输出copy
		for(char item: copy)
		{
			System.out.println(item);
		}


		
		
		
		
		
		
		
		
		
		
		
	}

}
