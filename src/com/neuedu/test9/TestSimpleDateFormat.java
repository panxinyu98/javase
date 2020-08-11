package com.neuedu.test9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
		// Date-> String
		//String a = "2018-1-1 15:14:19.80";
		Date now = new Date();
		String str = sdf.format(now);
		System.out.println(str);
		
		//String -> Date
		String a ="2020-1-1 15:16:17.80";
		try {
			Date d = sdf.parse(a);
			System.out.println(d);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}

}
