package com.neuedu.test9;

import java.io.UnsupportedEncodingException;

public class TestString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * �ַ�����Unicode������Ӧ��ϵ  �ַ�-��
		 * 
		 * �ַ����룺utf-8���䳤,Ӣ��1���ַ�������3���ַ�����utf-16
		 * �й���gbk(����+����)��gb2312(��������)->����ռ�����ַ���Ӣ��1��������2����
		 * 
		 * */
		String str = "neusoft�й�";
		
		char[]cs=str.toCharArray();
		
		String str2 = new String(cs);
		
		String str3 =  String.valueOf(cs);
		
		System.out.println(str3);
		
		//str-byte[]
		
		byte[] arr = null;
		try {
			
			arr = str.getBytes("utf-8");//ƽ̨Ĭ�ϱ���
			for(byte item:arr)
		{
			System.out.println(item);
		}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//byte[] ->string
		
		String str4 = new String(arr);
		
		System.out.println(str4);
	}

}
