package com.neuedu.test4;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��̬��ʼ��
		//�����Ƕ�����
		int[] arr=new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		//��̬��ʼ��
		int sum=0;
		int[] scores={80,23,45,67,90};//���ȶ���
		
            for(int i=0;i<scores.length;i++) 
            {
            	sum+=scores[i];
            }
		   double avg=(double)sum/scores.length; 
            
		System.out.println(avg);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
