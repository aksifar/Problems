/*In an Alien planet, a year has are 4 seasons, all seasons have equal number of days.
 * Winter Spring Summer & Autumn in the same order
 * The input array is number of days in the year, which has to be in multiple of 4 and has to be minimum 8.
 * The numbers in the input array represent the average temperature of the days.
 * Amplitude is the difference between max and min temperature of a season
 * So given the input array return the season with the maximum  amplitude temperature..
 */
package com.aksifar.Arrays;

import java.util.Arrays;

public class MaxAmplitudeTemperatureSeason {
	public static void main(String[] args) {
		
		int t[] = {-3, -14, -5, 7, 8, 42, 8, 3}; 
//		int t[] = {-3, -14, -5, 7, 8, 42, 8, 3,-3, -14, -5, 7, 8, 42, 8, 3};
//		int t[] = {2, -3, 3,1,10,8, 2,5,13, -5,3,-18};
		System.out.println(solution(t));
		
	}
	
	public static String solution(int[] T)
	{
		int seasonSize = T.length/4;
		int seasons[][] =  new int[4][seasonSize];
		int apmlitutes[] = new int[4];
		int maxAmplitude=0,season=-1;
		
		for(int i=0; i < T.length; i++)
		{
			//Winter
			if(i< seasonSize)
				seasons[0][i] = T[i];
			//Spring
			else if(i >= seasonSize && i< 2*seasonSize)
				seasons[1][i-seasonSize] = T[i];
			//Summer
			else if(i >= 2*seasonSize && i< 3*seasonSize)
				seasons[2][i-(2*seasonSize)] = T[i];
			//Autumn
			else if(i >= 3*seasonSize && i< 4*seasonSize)
				seasons[3][i-(3*seasonSize)] = T[i];
		}
		
		for(int i=0; i<4; i++)
		{
			apmlitutes[i] = calculateAmplitute(seasons[i]);
		}
		
		maxAmplitude = Arrays.stream(apmlitutes).max().getAsInt();
		for(int i=0; i<4; i++)
		{
			if(maxAmplitude == apmlitutes[i])
				season = i;
		}
		switch(season)
		{
			case 0: return "WINTER";
			case 1: return "SPRING";
			case 2: return "SUMMER";
			default: return "AUTUMN";
		}
	}
	
	/**
	 * calculates the amplitude
	 */
	public static int calculateAmplitute(int season[])
	{
		int max = Arrays.stream(season).max().getAsInt();
		int min = Arrays.stream(season).min().getAsInt();
		return max-min;
	}
	public static void printArray(int a[])
	{
		Arrays.stream(a).forEach(e -> System.out.print(e + " "));
		System.out.println();
	}
}
