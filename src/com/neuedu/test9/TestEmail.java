package com.neuedu.test9;

public class TestEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email = "pxy@neusoft.com";
		//����@������.
		//@��.ǰ��  @�����Կ�ͷ��.�����ڽ�β��@��.�м�Ҫ������
		
		if(email.indexOf("@")<=0 )
		{
			System.out.println("���벻�Ϸ�");
			return;
		}
		
		if(email.indexOf(".")<0 ||email.indexOf(".")==email.length()-1)
		{
			System.out.println("���벻�Ϸ�");
			return;
		}
		
		if(email.indexOf("@")>email.indexOf("."))
		{
			System.out.println("���벻�Ϸ�");
			return;
		}
		
		if(email.indexOf(".")-email.indexOf("@")<=1)
		{
			System.out.println("���벻�Ϸ�");
			return;
		}
		
		System.out.println("����Ϸ�");
		
		
		
		
	}

}
