package com.aksifar.Util;

import java.util.Arrays;

public final class ArrayUtil {
	
	//To prevent instantiation of the class
	private ArrayUtil(){};
	public static void printArray(int a[])
	{
		Arrays.stream(a).forEach(e -> System.out.print(e + " "));
		System.out.println();
	}
}
