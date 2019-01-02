/*
Input:  1/2 + 3/2
Output: 2/1

Input:  1/3 + 3/9
Output: 2/3

Input:  1/5 + 3/15
Output: 2/5
*/
package com.aksifar.practice;

import com.aksifar.Util.MathsUtil;

public class SumOfFractions {
	public void addFractions(int num1, int den1, int num2, int den2){
		int den3 = MathsUtil.gcd(den1, den2);
		
		den3= (den1*den2)/den3;
		int num3 = (num1)*(den3/den1) + (num2)*(den3/den2);
		
		lowest (num3, den3);
	}

	private void lowest(int numerator, int denonimator) {
		int commomnFactor = MathsUtil.gcd(numerator, denonimator);
		
		numerator = numerator/commomnFactor;
		denonimator = denonimator/commomnFactor;
		System.out.println(numerator + "/" + denonimator);
		
	}
	
	public static void main(String[] args) {
		SumOfFractions obj = new SumOfFractions();
		obj.addFractions(1, 2, 2, 3);
	}
}
