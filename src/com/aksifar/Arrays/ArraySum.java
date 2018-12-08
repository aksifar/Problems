//Given an array and a number n, we need to find the pair of numbers whose sum will be equal to n 
package com.aksifar.Arrays;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {

		int a[] = {2,5,5,0,10,9,8,1,3,6,7,4,-8,18};
		int sum =-1;
		
		findPairWithSum(sum, a);
	}

	public static void findPairWithSum(int sum, int a[]) {
	 Arrays.sort(a);
	 int currentSum = 0;
	 for(int i=0, j=a.length-1; i<j ; )
	 {
		 currentSum = a[i]+a[j];
		if(sum > currentSum)
		{
			++i;
		}
		else if(sum < currentSum)
		{
			--j;
		}
		 if(currentSum == sum)
		 {
			 	System.out.println("Pair: " + a[i] + " " +a [j]);
			 	++i;
		 }
	 }
		
	}
}
