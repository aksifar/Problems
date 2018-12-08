package com.aksifar.Arrays;

import java.util.Arrays;

public class ArrayUtil {
	public static void printArray(int a[])
	{
		Arrays.stream(a).forEach(e -> System.out.print(e + " "));
		System.out.println();
	}
}
