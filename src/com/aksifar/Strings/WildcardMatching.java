package com.aksifar.Strings;

public class WildcardMatching {
	
	public static void main(String[] args) {
		String str1 = "s?or?";
		String str2 = "sco??";
		
		String[] arr = {str1, str2}; 
		result(arr);
	}
	
	public static void result(String[] args){
		if (null != args[0] && !args[0].isEmpty() && null != args[1] && !args[1].isEmpty()){
			String str1 = args[0];
			String str2 = args[1];
			
			for(int i= 97; i<=123; i++){
				char c = (char)i;
				String replacement = Character.toString(c);
				
				String temp1 = str1.replace("?", replacement);
				String temp2 = str2.replace("?", replacement);
				if(temp1.equals(temp2))
				{
					System.out.println("YES");
					return;
				}
			}
        }
			System.out.println("NO");
	}
}
