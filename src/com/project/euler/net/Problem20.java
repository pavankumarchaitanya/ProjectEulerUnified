package com.project.euler.net;

import java.math.BigInteger;
import java.util.ArrayList;

public class Problem20 {

	/**
	 * @param args
	 */
	
	ArrayList<BigInteger> listOfFactorials = new ArrayList<BigInteger>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//memoize
		
		
	}

	BigInteger factorial(int number)
	{
		if(number == 0 || number ==1 )
		{
			return new BigInteger("1"); 
			
		}
		if(listOfFactorials.get(number)!=null)
		{
			return listOfFactorials.get(number);
		}
		else
		{
			new BigInteger(""+number).multiply(factorial(number-1));
		}
		
	}
}
