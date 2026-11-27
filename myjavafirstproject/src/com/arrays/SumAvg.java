package com.arrays;

public class SumAvg {

	public static void main(String[] args) {
		int[] marks= {99,98,97,96,95,94};
		int sum=0;
		int avg=0;
		for(int i=0;i<marks.length;i++) {
			sum=sum+marks[i];
			avg=sum/marks.length;
			
		}
		System.out.println(sum);
		System.out.println(avg);
	}

}
