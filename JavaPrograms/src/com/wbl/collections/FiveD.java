/*5.d. Write a program having below methods.
  			--> To create a hashmap.
  			--> To search for a key in the created map and then returns its value*/
package com.wbl.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FiveD {

	public void hashMap(){
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"smith");
		map.put(2, "george");
		map.put(3, "Rosy");
		
		Set<Integer> keys=map.keySet();
		
		for(Integer key:keys){
			System.out.println(key+"::"+map.get(key));
		}
		if(map.containsKey(3)){
		System.out.println("value of the key is:"+map.get(3));
		}else{
			System.out.println("key is not present");
		}
		
		}
	
	public static void main(String[] args) {
		FiveD mp=new FiveD();
		mp.hashMap();
	}
	
}
