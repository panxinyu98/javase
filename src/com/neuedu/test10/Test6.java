package com.neuedu.test10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test6 {

	//35选7
	//hashset存储位置由hash算法决定（不排序时）
	//treeset内部是排序的（需要排序用它）
	public static void main(String[] args) {
	
		Random r = new Random();
		
		HashSet set = new HashSet();
		
		while(set.size()<7)

		{
			//生成一个数1-35
			int num = r.nextInt(35)+1;
			set.add(num);
			
		}
		//打印7个数
		Iterator iter = set.iterator();
		while(iter.hasNext())
		{
			Object o = iter.next();
			System.out.println(o);
			//放数组里
		}
		
		//数组冒泡排序
	}

}
