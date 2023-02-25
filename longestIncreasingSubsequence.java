package com.simpli.longestincresubsequence;

public class longestIncreasingSubsequence {

	public static void main(String[] args) {
		
		int [] array = {10,22,9,33,21,50,41,60,80};
		
		int length = array.length;
		
		System.out.println("The given array is ::::::");
		
		for (int i =0;i<length;i++) {
			
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\nThe length of array is :: "+length);
		
		int lisLength = longestIncreasingSubsequence(array,length);
		
		System.out.println( " \nThe  length of longest Integer Subsequence is :::"+lisLength);
		

	}
	
	
	
	
	public static  int  longestIncreasingSubsequence (int [] array,int length) {
		
		int []LIS = new int[length];
		 
		int lis = 0;
		
		
		
		for (int i =0;i<length;i++) {
			LIS[i] = 1;
			
			for (int j =0;j<i;j++) {
				
				if (array[i] > array[j] && LIS[i]<LIS[j]+1 ) {
					
					
					LIS[i] = LIS[j] + 1;
					
					
					
				}
				if (lis<LIS[i]) {
					lis = LIS[i];
					
				}
				
			}
		}
		return lis;
		
		
		
	}

}
