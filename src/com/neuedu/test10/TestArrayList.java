package com.neuedu.test10;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�䳤
		//������������
		//List���ظ���
		ArrayList list = new ArrayList();
		list.add("aa");
		list.add("bb");
		list.add("aa");
		
		System.out.println(list.get(0));//aa
		System.out.println(list.get(1));//bb
		System.out.println(list.get(2));//aa
		
		System.out.println(list.size());//�õ����ϵĳ���
		
		for(int i=0;i<list.size();i++)
		{
			Object o = list.get(i);
			String str = (String)o;
			System.out.println(str);
		}
		
		Integer a = 10;//�Զ�װ��
		 
		int b = a;//�Զ�����
		
		ArrayList list2 = new ArrayList();
		list2.add(1);//�Զ�װ��
		list2.add(2);
		list2.add(3);
		
		for(int i=0;i<list2.size();i++)
		{
			Object o = list2.get(i);
			System.out.println(o);
		}
	}

}
