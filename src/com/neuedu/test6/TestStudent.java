package com.neuedu.test6;

import java.util.Scanner;

public class TestStudent {
public static void main(String[] args) {
	//����һ������
	Student[] stus= new Student[5];
	
	for(int i=0;i<stus.length;i++)
	{   //�����û�����
		//Scanner��bug,

		Scanner sc = new Scanner(System.in);
		System.out.println("�������"+(i+1)+"��ѧ����Ϣ");
	
	
	
	String name = sc.nextLine();
	int sno= sc.nextInt();
	double score=sc.nextDouble();
	
	stus[i]= new Student(name,sno,score);
	
	}
	
	
	/*stus[0] = new Student("s1",1,88);
	stus[1] = new Student("s2",1,88);
	stus[2] = new Student("s3",1,88);
	stus[3] = new Student("s4",1,88);
	stus[4] = new Student("s5",1,88);*/
	
	//���������� ð������
	//����������
	for(int i=1;i<stus.length;i++)
	{
		for(int j=0;j<stus.length-i;j++)
		{
			if(stus[j].score <stus[j+1].score )
			{
				Student temp = stus[j];
				stus[j]=stus[j+1];
				stus[j+1]=temp;
			}
		}
	}
	

	
	//�����ǰ��ճɼ��������е�
			for(Student item : stus)
			{
				System.out.println(item.name + "\t" + item.score);
			}

	
	
	
}
	
	
}

class Student{
	String name;
	int sno;
	double score;
	
	public Student(String name,int sno,double score)
	{
		this.name=name;
		this.sno=sno;
		this.score=score;
	}
}