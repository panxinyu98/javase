package com.neuedu.test9;

import java.io.UnsupportedEncodingException;

public class TestString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 字符集（Unicode）：对应关系  字符-数
		 * 
		 * 字符编码：utf-8（变长,英文1个字符，中文3个字符），utf-16
		 * 中国：gbk(简体+繁体)，gb2312(简体中文)->中文占两个字符（英文1个，中文2个）
		 * 
		 * */
		String str = "neusoft中国";
		
		char[]cs=str.toCharArray();
		
		String str2 = new String(cs);
		
		String str3 =  String.valueOf(cs);
		
		System.out.println(str3);
		
		//str-byte[]
		
		byte[] arr = null;
		try {
			
			arr = str.getBytes("utf-8");//平台默认编码
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
