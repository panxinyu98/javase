package com.neuedu.test10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<>();
		
		//map里放东西
		//key不能重复
		//无序，根据key的hashcode决定存放位置
		map.put("abc", 90);		
		map.put("xx", 80);
		map.put("tom", 88);
		map.put("jack", 77);
		
		System.out.println(map.get(2));
		System.out.println(map.size());
		
		//遍历，得到所有的元素
		//1. 先得所有key, 根据key得value
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext())
		{
			String key = iter.next();
			Integer value = map.get(key);
			System.out.println(key+"-"+value);
		}
		
		//2.遍历每一组key-value对
		Set<Entry<String, Integer>> entry = map.entrySet();
		Iterator<Entry<String, Integer>> iter2 = entry.iterator();
		while(iter2.hasNext())
		{
			Entry<String, Integer> e = iter2.next();
			
			System.out.println(e.getKey() + "-" +e.getValue());
		}

	}

}
