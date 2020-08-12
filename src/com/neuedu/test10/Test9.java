package com.neuedu.test10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		//lamda
		list.forEach(item ->{
			
			System.out.println(item);
			
		});
		
		Set<String> set = new HashSet<>();
		set.add("aa");
		set.add("bb");
		set.add("cc");
		
		//lamda
		set.forEach(item ->{
			
			System.out.println(item);
			
		});
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "xx");
		map.put(2, "yy");
		map.put(3, "zz");
		
		map.forEach((k,v)->{
			
			System.out.println(k+"-"+v);
			
		});

	}

}
