package com.arrays;

public class MinMax {

	public static void main(String[] args) {
		int[] arr= {9,10,4,6,7,3,2,1,13};
		int min=arr[0];
		int max=arr[0];
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]<min){
        		min=arr[i];
        		
        	}else if(arr[i]>max) {
        		max=arr[i];
        	}
        }
        System.out.println(min);
        System.out.println(max); 

	}

}
