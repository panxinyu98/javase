package com.neuedu.test9;

import java.util.Calendar;
import java.util.Date;

public class TestCalender {

	public static void main(String[] args) {
		//c����ǰϵͳʱ�� 
	
				Calendar c = Calendar.getInstance();
				
				int year = c.get(Calendar.YEAR);
				int month = c.get(Calendar.MONTH);
				int date = c.get(Calendar.DATE);
				int hour = c.get(Calendar.HOUR_OF_DAY);
				int minute = c.get(Calendar.MINUTE);
				int second = c.get(Calendar.SECOND);
				
				String str = year + "-" + (month + 1) + "-" + date + " "+hour+":"+minute+":"+second;
				
				System.out.println(str);
				
				//����ʱ��Ĳ�ͬ����
				//ע��:month��0��ʼ��
				//Ӳ���� ����
				c.set(Calendar.YEAR, 1999);
				c.set(Calendar.MONTH, 2);
				c.set(Calendar.DATE, 15);
				c.set(Calendar.HOUR_OF_DAY, 18);
				c.set(Calendar.MINUTE, 19);
				c.set(Calendar.SECOND, 20);
				//c.set(1999, 1, 20);
				//c.set(2020, 1, 20, 18, 14, 15);
				
				Date now =c.getTime();
				
				System.out.println(now);
				
				

	}

}
