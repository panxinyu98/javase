package com.neuedu.test9;

import java.util.Calendar;

public class Pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DATE, 1);
		int day = c.get(Calendar.DAY_OF_WEEK);
		
		//����һ���ж�����
		int maxDay = c.getActualMaximum(Calendar.DATE);
		
		//��ӡͷ
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		//��ӡ��ͷ�Ŀհ�
		for(int i=1;i<day;i++){
			System.out.print("\t");
		}
		for(int i=1;i<=maxDay;i++){
			System.out.print(i+"\t");
			
			//��ӡ����
			if((day + i -1)%7==0){
				System.out.println();
			}
				
		}

	}

} 