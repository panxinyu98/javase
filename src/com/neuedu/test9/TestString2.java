package com.neuedu.test9;

public class TestString2 {

	public static void main(String[] args) {
		
		
		String a = "hello";
		String b = "HELLO";
		System.out.println(a.equals(b));//false
		System.out.println(a.equalsIgnoreCase(b));//true
		
		//compareTo
		System.out.println(a.compareTo(b));
		System.out.println(a.compareToIgnoreCase(b));
		
		
		//startsWith
		//endsWith
		System.out.println(a.startsWith("he"));
		System.out.println(a.endsWith("llo"));
		
		//������ϵ
		System.out.println(a.contains("elo"));
		
		//�����Ӵ����ֵ�λ�ã� �Ҳ�������-1
		System.out.println(a.indexOf("lll"));//2
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
