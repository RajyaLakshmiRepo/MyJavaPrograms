/*5.c. Write a program which takes an input series as a1,a2,a3....an,b1,b2,b3...bn and 
  produces output as a1,b1,a2,b2,a3,b3.......,an,bn. */  		

package com.wbl.collections;

public class FiveC {
	
	public  void arrayMovement(){
	int[] arr={1,3,5,7,2,4,6,8};
		int n=(arr.length-1);
		int a=1;
		for(int i=1;i<n;i++){
			int temp=arr[i];
			arr[n/2+a]=arr[i];
			for(int j=arr[n/2+a];j>i;j--){
				arr[j]=arr[j-1];
			}
				i++;
				arr[i]=temp;
				System.out.println(arr);
			a++;
			
			
		}
	}
		

	public static void main(String[] args) {
		
		FiveC fc=new FiveC();
		fc.arrayMovement();
		
	}

}
