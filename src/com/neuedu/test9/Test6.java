package com.neuedu.test9;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		String str3 = str2.replace(str1, "");
		
		int count = (str2.length() - str3.length())/str1.length();
		
		System.out.println(count);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
