package com.neuedu.test10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class TestHashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,User> map = new HashMap<>();
		
		map.put(1, new User(1,"xx",88888));
		map.put(2, new User(2,"yy",77777));
		map.put(3, new User(3,"zz",99999));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("查询所有-----------------1");
		System.out.println("查询某人-----------------2");
		
		int num = sc.nextInt();
		switch(num)
		{
		case 1:
			Set<Entry<Integer, User>> entry = map.entrySet();
			Iterator<Entry<Integer, User>> iter = entry.iterator();
			while(iter.hasNext())
			{
				Entry<Integer, User>  e =iter.next();
				System.out.println(e.getKey()+"-"+e.getValue().name + "-" + e.getValue().money);
			}
			break;
		case 2:
			System.out.println("请输入用户id");
			sc = new Scanner(System.in);
			int id = sc.nextInt();
			//根据id找人
			User u = map.get(id);
			System.out.println(u.name+"-"+u.money);
			break;
		default:
			System.out.println("输入不合法");
		}

	}

}

class User{
	
	Integer id;
	String name;
	double money;
	
	public User(Integer id, String name, double money)
	{
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
}