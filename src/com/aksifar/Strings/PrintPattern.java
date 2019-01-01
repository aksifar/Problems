/*
 * input will be a positive integer 1 <= n <= 100
 * out will be n rows; example n = 5
 * output:
	1
	3*2
	4*5*6
	10*9*8*7
	11*12*13*14*15  
*/
package com.aksifar.Strings;

public class PrintPattern {


	public static void main(String[] args) {
		PrintPattern p = new PrintPattern();
		p.buildPattern(5);
	}
	
	public void buildPattern(int n)
	  {
		int count = 1;
		for(int i=1; i<=n; i++)
		{
			StringBuilder sb = new StringBuilder();
			for(int j=1; j<=i; j++)
			{
				//even rows needs to be reversed
				if(i%2 == 0)
				{
					sb.append(count);
					//don't add '*' after last number
					if(i!=j)
					{
						sb.append("*");
					}
				}
				//odd rows should be printed directly
				else
				{
					System.out.print(count);
					//don't add '*' after last number 
					if(i!=j)
					{
						System.out.print("*");
					}
				}
				++count;
			}
			if(sb.length() > 0)
			{
				System.out.print(reverseOddRow(sb.toString()));
				sb.setLength(0);
			}
			System.out.println();
		}
	  }
	
	private static String reverseOddRow(String input)
	{
		String a[]  = input.split("\\*");
		String result = "";
		for(int i=a.length-1; i>=0 ; i--)
		{
			result = result + a[i];
			//don't add '*' after last number
			if(i !=0 )
			{
				result = result + "*";
			}
		}
		return result;
	}
}
