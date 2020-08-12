package com.neuedu.test10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Stu> list  = new ArrayList<>();
		
		list.add(new Stu("hh",20,88));
		list.add(new Stu("yy",30,99));
		list.add(new Stu("aa",40,77));
		
		//list中元素实现了comparable接口
		Collections.sort(list);
		
		for(Stu s : list)
		{
			System.out.println(s.name +"\t"+s.age+"\t"+s.score);
			
		}
	}
	

	
static class Stu implements Comparable<Stu>{
	String name;
	int age;
	double score;
	
	public Stu(String name,int age,double score){
		this.name=name;
		this.age=age;
		this.score=score;
		
	}
	//提供比较规则
	@Override
	public int compareTo(Stu o) {
		// TODO Auto-generated method stub
		/*if(this.score>o.score)
		{
			return 1;
		}
		else if(this.score<o.score)
		{
			return -1;
		}
		return 0;*/
		
		return this.name.compareTo(o.name);

	}
}

}


