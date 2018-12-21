package com.aksifar.Strings;

public class BreakTheStringIntoSmallSMSBasedOnGivenSizeK {

	public static void main(String[] args) {
		String s = "SMS messages are really short";
//		String s = "SMS ";
		System.out.println("Solution: " + solution(s, 8)) ;
	}
	
	public static int solution(String S, int K)
	{
		int msgCount = 1;
		int counter=0;
		int lastCounter=0;
		int wordLength =0;
		int messageLength =  K;
		boolean newMessage = true, lastWord = false;
		//over the string
		while(counter < S.length() && !lastWord)
		{
			//for each message
			while(messageLength>0 && !lastWord)
			{
				if(!newMessage)
					--messageLength; //for spaces
				if((S.indexOf(' ', counter) !=  -1) && messageLength > 0)
				{
					 wordLength = S.indexOf(' ', counter)-counter;
					 counter = counter + wordLength+1;
				}
				else{
					wordLength = (S.length()-1) - counter;
					counter = S.length();
					lastWord = true;
				}
				//if the word can still  fit in the sms
				if(messageLength >= wordLength)
				{
					messageLength = messageLength-wordLength;
					lastCounter = counter;
					newMessage = false;
				}
				else
				{
					counter = lastCounter;
					messageLength =0;
				}
			}
			newMessage = true;
			messageLength=K;
			++msgCount;
			
		}
		
		return msgCount;
	}
}
