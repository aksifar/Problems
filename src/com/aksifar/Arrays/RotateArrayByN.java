package com.aksifar.Arrays;

import com.aksifar.Util.ArrayUtil;

public class RotateArrayByN {
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,};
		RotateArrayByN t = new RotateArrayByN(); 
		
		System.out.println("Before");
		ArrayUtil.printArray(a);
		System.out.println("After");
		ArrayUtil.printArray(t.rotateByN(a, 8));
		
	}
	
	private int[] rotateBy1(int a[]){
		
		if(!(a.length > 0))
			return null;
		int temp = a[a.length-1];
		for(int i = a.length-1; i>0; i--)
		{
			a[i] = a[i-1];
		}
		a[0] = temp;
		
		return a;
	}
	
	private int[] rotateByN(int a[], int n)
	{ 
		for(int i=n ; i >0; i--)
		{
			a = rotateBy1(a);
		}
		return a;
	}
}
