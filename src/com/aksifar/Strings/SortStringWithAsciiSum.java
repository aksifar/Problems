/*
 * This program sorts a list of String based on the their Acsii sum.
 */
package com.aksifar.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SortStringWithAsciiSum implements Comparable<SortStringWithAsciiSum>{
	
	private final String value;
	private final long aciiSum;
	
	SortStringWithAsciiSum(String value)
	{
		this.value = value;
		this.aciiSum =  this.aciiSum(value);
	}

	public String getValue() {
		return value;
	}

	public long getAciiSum() {
		return aciiSum;
	}
	
	private long aciiSum(String input)
	{
		long sum = 0;
		for(int i=0; i< input.length(); i++)
		{
			sum = sum + (int)input.charAt(i);
		}
		return sum;
	}

	@Override
	public int compareTo(SortStringWithAsciiSum that) {
		return ((Long)this.aciiSum).compareTo(that.getAciiSum());
	}
	
	@Override
	public String toString() {
		String result = "Value: " + this.value + " | " + "ASCII_Sum: " + this.aciiSum;
		return result;
	}
	
public static void main(String[] args) {
		
		List<SortStringWithAsciiSum> values = new ArrayList<>();
		
		//Creating Values for which ASCII will  be calculated
		SortStringWithAsciiSum value1 = new SortStringWithAsciiSum("Relentless Commitment to Impact");
		SortStringWithAsciiSum value2 = new SortStringWithAsciiSum("Robust as Fudge");
		SortStringWithAsciiSum value3 = new SortStringWithAsciiSum("Be Surprisingly Bold");
		SortStringWithAsciiSum value4 = new SortStringWithAsciiSum("Get Back Up");
		SortStringWithAsciiSum value5 = new SortStringWithAsciiSum("Make it Happen");
		SortStringWithAsciiSum value6 = new SortStringWithAsciiSum("Don't be a Jerk");
		SortStringWithAsciiSum value7 = new SortStringWithAsciiSum("Confront the Grey");
		SortStringWithAsciiSum value8 = new SortStringWithAsciiSum("Laugh Together, Grow Together");
		
		//Adding values to the list.
		values.add(value1);
		values.add(value2);
		values.add(value3);
		values.add(value4);
		values.add(value5);
		values.add(value6);
		values.add(value7);
		values.add(value8);
	
		//Sorting values based on ASCII sum.
		Collections.sort(values);
		
		//Printing Values for illustration
		for(SortStringWithAsciiSum value:  values)
		{
			//Overidden toString() prints the desired format.
			System.out.println(value);
		}
	}
}

