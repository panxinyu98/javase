package com.neuedu.test9;

public class TestEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email = "pxy@neusoft.com";
		//包含@，包含.
		//@在.前面  @不可以开头，.不能在结尾，@和.中间要有内容
		
		if(email.indexOf("@")<=0 )
		{
			System.out.println("输入不合法");
			return;
		}
		
		if(email.indexOf(".")<0 ||email.indexOf(".")==email.length()-1)
		{
			System.out.println("输入不合法");
			return;
		}
		
		if(email.indexOf("@")>email.indexOf("."))
		{
			System.out.println("输入不合法");
			return;
		}
		
		if(email.indexOf(".")-email.indexOf("@")<=1)
		{
			System.out.println("输入不合法");
			return;
		}
		
		System.out.println("输入合法");
		
		
		
		
	}

}
