package com.neuedu.test10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test6 {

	//35ѡ7
	//hashset�洢λ����hash�㷨������������ʱ��
	//treeset�ڲ�������ģ���Ҫ����������
	public static void main(String[] args) {
	
		Random r = new Random();
		
		HashSet set = new HashSet();
		
		while(set.size()<7)

		{
			//����һ����1-35
			int num = r.nextInt(35)+1;
			set.add(num);
			
		}
		//��ӡ7����
		Iterator iter = set.iterator();
		while(iter.hasNext())
		{
			Object o = iter.next();
			System.out.println(o);
			//��������
		}
		
		//����ð������
	}

}
