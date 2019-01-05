package com.aksifar.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberFrequencyInArray {

	public static void main(String[] args) {
		
		int numbers[] = {1,1,2,3,2,8,7,6,3,4};
		
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		
		for(int i=0; i < numbers.length; i++)
		{
			//if number is already present in the map
			if( frequencyMap.containsKey(numbers[i]) )
			{
				int value = frequencyMap.get(numbers[i]);
				frequencyMap.put(numbers[i], value+1);
			}
			else
			{
				frequencyMap.put(numbers[i], 1);
			}
		}
		
		Set<Integer> keys = frequencyMap.keySet();
		for(Integer key : keys)
		{
			System.out.println("Key: " + key + " Frequency: " + frequencyMap.get(key));
		}
	}
}
