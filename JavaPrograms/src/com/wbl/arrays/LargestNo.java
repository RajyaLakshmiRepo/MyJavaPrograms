//to find the largest number in a given array.
package com.wbl.arrays;

public class LargestNo {
    
	public void arrayEle(){
		 int[] numbers={15,-38,55,-78,96,-476};
		 int largest=numbers[0];
		 for(int i=0;i<numbers.length;i++){
			 if(numbers[i]>largest){
				 largest=numbers[i];
			 }
		 } 
	System.out.println("Largest number is::"+largest);
	}
	public static void main(String[] args) {
		LargestNo ln=new LargestNo();
		ln.arrayEle();
	}
}
