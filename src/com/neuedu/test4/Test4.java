package com.neuedu.test4;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ð������
		int[] arr={12,22,3,56,78,21};
		for(int i=1;i<arr.length;i++) //�Ƚ�����    
			//�ڼ���ѭ������һ�� �Ƚ���� ���ڶ��˱Ƚ��Ļأ������˱Ƚ����أ�...
			//��ֹԽ�磬ÿ�������һ�ε����ֵ����Ҫ��������Ǹ���ȥ���ٽ��бȽ�
		{
			for(int j=0;j<arr.length-i;j++)//j�Ƚϴ���
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=	arr[j+1];
					arr[j+1]=temp;
							
							
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{ 
			System.out.println(arr[i]);
	    }
		
	}
	

}
