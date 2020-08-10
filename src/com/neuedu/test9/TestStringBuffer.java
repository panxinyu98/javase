package com.neuedu.test9;

public class TestStringBuffer {

	public static void main(String[] args) {
		/*
		 * StringBuffer(����)���̰߳�ȫ�ģ���synchronized������߳�ͬʱ����StringBuffer������ݣ����ݲ���
		 * 
		 * StringBuilder(����)���̲߳���ȫ��û��synchronized������߳�ͬʱ���������ݿ��ܻ����
		 *
		 * ���̣߳����Կ���ʹ��StringBuffer�����ݰ�ȫ
		 * ���̣߳�ʹ��StringBuilder��Ч�ʸ�
		 * */
		
		 
		
		// TODO Auto-generated method stub

		StringBuffer buffer= new StringBuffer("hello");
		
		buffer.append("world");
		System.out.println(buffer);
		System.out.println(buffer.toString());
		
		String str = buffer.toString();
		buffer.insert(0, "w");
		System.out.println(buffer);
		
		buffer.deleteCharAt(1);
		System.out.println(buffer);
		
		buffer.delete(1, 4);
		System.out.println(buffer);
		
		buffer.replace(0, 2, "abc");
		System.out.println(buffer);
		
		
		
	}

}
