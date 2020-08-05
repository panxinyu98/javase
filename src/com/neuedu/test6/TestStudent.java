package com.neuedu.test6;

import java.util.Scanner;

public class TestStudent {
public static void main(String[] args) {
	//创建一个数组
	Student[] stus= new Student[5];
	
	for(int i=0;i<stus.length;i++)
	{   //接受用户输入
		//Scanner有bug,

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第"+(i+1)+"个学生信息");
	
	
	
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
	
	//给数组排序 冒泡排序
	//给数组排序
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
	

	
	//数组是按照成绩倒序排列的
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