package com.neuedu.test9;

public class TestWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����������͸���װ��ת��
		int a =100;
		Integer aa = new Integer(a);
		int a2 = aa.intValue();
		
		
		long b=100;
		Long bb=new Long(b);
		long b2=bb.longValue();
		
		//�ַ����������������ת��
		String str = "10";
		int x=Integer.parseInt(str);
		long xx= Long.parseLong(str);
		byte xxx= Byte.parseByte(str);
		
		System.out.println(x );
		
		String str2 = "ff";
		int y=Integer.parseInt(str2,16);//16����
		System.out.println(y);
		
		//str->Integer
		String s1="100";
		Integer _s1=new Integer(s1);
		Integer $s1=Integer.valueOf(s1);
		//Integer->str
		String ss= _s1.toString();
		System.out.println(ss);
		
		
		
		
		
	}

}
