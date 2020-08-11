package com.neuedu.test10;

import java.util.LinkedList;

public class Test4 {
/*
 * ArrayList:顺序存储，内存地址空间连续，随机访问快，插入删除效率低
 * LinkedList：链表，内存地址不连续，随机访问慢，查入和删除效率高
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list= new LinkedList();
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		list.addFirst("h");
		list.addLast("d");
		
		list.removeFirst();
		list.removeLast();
		
		for(Object o:list)
		{
			System.out.println(o);
		}
		
		
	}

}
