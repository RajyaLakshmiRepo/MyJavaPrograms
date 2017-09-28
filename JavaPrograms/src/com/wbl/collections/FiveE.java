//5.eWrite a program to sort a map by value.
package com.wbl.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class FiveE {
	public void sorting(){
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(100, "alan");
		map.put(1245, "john");
		map.put(8994, "kim");
		map.put(33, "alex");
	
		
		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		for (Map.Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + "::" + entry.getValue());
		}
		
	}

	public static void main(String[] args) {
		FiveE sm=new FiveE();
		sm.sorting();

	}

}
