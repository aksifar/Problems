/*
 * Given 2 input non negative integer numbers A and B.
 * for A =5, u need to append the result char with 'a' 5 times.
 * for B = 3, the result string should have char 'b'3 times
 * u can't have 'a' or 'b' more than twice consecutively
 * so, if A=5 & B=3,then, result = "aabaabab" or "abbaaba"   
 */

package com.aksifar.Strings;

public class OptimizeCharOccurence {

	public static void main(String[] args) {
		int A= 10;
		int B =4;
		System.out.println(solution(A,B));
	}
	
	public static String solution(int A, int B)
	{
		if(A == B )
		{
			String result="";
			for(int i=1; i <= A; i++)
				result = result + "ab";
			return result;
		}
		else if (A > B) return ab(A,B);
		else return ba(A,B); 
	}
	
	public static String ab (int A, int B){
		String result="";
		String temp="";
		for(; A+B>0;)
		{
			if(A >= 2)
			{
				temp = temp + "aa";
				if(temp.contains("aaa"))
					temp = result;
				else
				{
					A = A-2;
					result = temp;
				}
			}
			else if( A > 0)
			{
				temp = temp + "a";
				if(temp.contains("aaa"))
					temp = result;
				else
				{
					A = A-1;
					result = temp;
				}
			}
			if(B >= 2 && !(A+2>=2*B))
			{
				temp = temp + "bb";
				if(temp.contains("bbb"))
					temp = result;
				else
				{
					B = B-2;
					result = temp;
				}
			}
			else if (B > 0)
			{
				temp = temp + "b";
				if(temp.contains("bbb"))
					temp = result;
				else
				{
					B= B-1;
					result = temp;
				}
			}
			result = temp;
		}
	return result;
	}
	
	public static String ba(int A, int B){
		String result="";
		String temp="";
		for(; B+A>0;)
		{
			if(B >= 2)
			{
				temp = temp + "bb";
				if(temp.contains("bbb"))
					temp = result;
				else
				{
					B = B-2;
					result = temp;
				}
			}
			else if( B > 0)
			{
				temp = temp + "b";
				if(temp.contains("bbb"))
					temp = result;
				else
				{
					B = B-1;
					result = temp;
				}
				
			}
			if(A >= 2 && !(B+2>=2*A))
			{
				temp = temp + "aa";
				if(temp.contains("aaa"))
					temp = result;
				else
				{
					A = A-2;
					result = temp;
				}
			}
			else if (A > 0)
			{
				temp = temp + "a";
				if(temp.contains("aaa"))
					temp = result;
				else
				{
					A= A-1;
					result = temp;
				}
			}
			result = temp;
		}
	return result;
	}
}
