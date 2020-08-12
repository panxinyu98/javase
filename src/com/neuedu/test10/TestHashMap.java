package com.neuedu.test10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<>();
		
		//map��Ŷ���
		//key�����ظ�
		//���򣬸���key��hashcode�������λ��
		map.put("abc", 90);		
		map.put("xx", 80);
		map.put("tom", 88);
		map.put("jack", 77);
		
		System.out.println(map.get(2));
		System.out.println(map.size());
		
		//�������õ����е�Ԫ��
		//1. �ȵ�����key, ����key��value
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext())
		{
			String key = iter.next();
			Integer value = map.get(key);
			System.out.println(key+"-"+value);
		}
		
		//2.����ÿһ��key-value��
		Set<Entry<String, Integer>> entry = map.entrySet();
		Iterator<Entry<String, Integer>> iter2 = entry.iterator();
		while(iter2.hasNext())
		{
			Entry<String, Integer> e = iter2.next();
			
			System.out.println(e.getKey() + "-" +e.getValue());
		}

	}

}
