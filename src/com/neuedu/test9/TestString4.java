package com.neuedu.test9;

public class TestString4 {

	public static void main(String[] args) {
		
		String str="aa   bb cc dd";
		
		// \s 空白，\d数字
		String[] arr=str.split("\\s+");
		for(String item:arr)
		{
			System.out.println(item);
		}
		
		String str2 = "a1ca2c";
		
		String str3=str2.replace('a', 'h');
		
		System.out.println(str2);
		System.out.println(str3);
		
		String str4=str2.replace("ab", "hh");
		System.out.println(str4);
		
		String str5=str2.replaceAll("\\d", "h");
		System.out.println(str5);
		
		String str6=str2.replaceAll("\\d", "h");
		System.out.println(str6);
		
		System.out.println(str2.toUpperCase());
		System.out.println(str2);
		
		System.out.println(str2.charAt(2));//c
		
		//截取字符串
		String s1 = "abcdefg";
		
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2,5));//cde
		
		String s2 = " abc abc abc ";
		System.out.println(s2.indexOf("abc"));//0
		System.out.println(s2.indexOf("abc,3"));//3
		
		System.out.println(s2.lastIndexOf("abc"));//6
		
		System.out.println(s2.trim());//去除前后空格
		System.out.println(s2.replace(" ", ""));//把中间的空格去掉
		
		System.out.println(str2.concat("haha"));
		
		
		
	}
}
