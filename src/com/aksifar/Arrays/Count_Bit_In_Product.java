package com.aksifar.Arrays;

public class Count_Bit_In_Product {
	
	public static int solution(int A, int B) {
        // write your code in Java SE 8
        int product = A*B;
        String binary = "";
        int bitCount = 0;
        while(product > 0)
        {
            binary = ((product % 2) == 0 ? "0" : "1") + binary;
            product = product / 2;
        } 
        
        System.out.println("binary: " + binary);
        for(int i=0; i<binary.length(); i++)
        {
            if(binary.charAt(i) == '1')
            {
                ++bitCount;
            }
        }
        return bitCount;
	}
	
	public static void main(String[] args) {
		System.out.println("bits: "+ solution(7,7));
	}
}
