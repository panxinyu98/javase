package com.neuedu.test10;

import java.util.LinkedList;

public class Test4 {
/*
 * ArrayList:˳��洢���ڴ��ַ�ռ�������������ʿ죬����ɾ��Ч�ʵ�
 * LinkedList�������ڴ��ַ������������������������ɾ��Ч�ʸ�
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
