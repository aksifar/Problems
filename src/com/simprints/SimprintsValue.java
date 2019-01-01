package com.simprints;

public final class SimprintsValue implements Comparable<SimprintsValue>{
	
	private final String value;
	private final long aciiSum;
	
	SimprintsValue(String value)
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
	public int compareTo(SimprintsValue that) {
		return ((Long)this.aciiSum).compareTo(that.getAciiSum());
	}
	
	@Override
	public String toString() {
		String result = "Value: " + this.value + " | " + "ASCII_Sum: " + this.aciiSum;
		return result;
	}
}

