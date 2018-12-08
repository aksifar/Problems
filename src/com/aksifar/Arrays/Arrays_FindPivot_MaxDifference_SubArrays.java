package com.aksifar.Arrays;
/* Given an array A[] of size n. K is an  index in the array 0 <= k <= n-1
 * K divides array into 2 sub-arrays a1[] & a[].
 * We need to find maximum difference of both sub arrays.
 * i.e maximumDifference = max(a1) - max(a2)
 * pivotK is the pivot which achives maximum difference
 */
import java.util.Arrays;

public class Arrays_FindPivot_MaxDifference_SubArrays {
	
public static void main(String[] args) {
	int a[] = {0,1,3,-3,-4, 0};
	System.out.println("Maximum Difference : " + solution(a));
}


public static int  solution(int[] A) {
	int a1[],a2[];
	int max1, max2;
	int diff = 0 , maxDiff = Integer.MIN_VALUE;
	int pivotK = -1;
	
	for(int k=0; k < A.length-1; k++)
	{	
		//create 2 arrays
		a1 = new int [k+1];
		a2 = new int[A.length - (k+1)];
		
		for(int i=0; i<=k; i++)
		{
			a1[i] = A[i];
		}
		
		for(int i=k+1,j=0; i<A.length; i++, j++)
		{
			a2[j] = A[i];
		}
		
		max1 = getMaxFromArray(a1);
		max2 = getMaxFromArray(a2);
		
		diff = max1-max2;
		if(diff > maxDiff)
		{
			maxDiff = diff;
			pivotK = k;
		}
	}
	return maxDiff;
}

	public static  int getMaxFromArray(int a[])
	{
		return Arrays.stream(a).max().getAsInt();
	}
}