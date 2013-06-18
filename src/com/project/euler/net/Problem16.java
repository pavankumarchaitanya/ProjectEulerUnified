package com.project.euler.net;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Problem16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BigInteger bigintObj = new BigInteger("2") ; 
BigInteger bigintObjTwo = new BigInteger("2");
for(int i =0; i < 999;i++)
{
bigintObj = bigintObj.multiply(bigintObjTwo);
		
}
int sum = AddNumbersInAString(bigintObj.toString());
System.out.println("Sum of all digits in : "+ bigintObj);
System.out.println("is  : " + sum);
	}



public static int AddNumbersInAString(String S)
{
	System.out.println("Length of String: " + S.length());
	int temp = 0; 
	for(int i=0; i < S.length(); i++)
	{
		temp += Integer.parseInt("" + S.charAt(i));
	}
	return temp;
}
}