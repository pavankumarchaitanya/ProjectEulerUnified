package com.project.euler.net;

import java.math.BigInteger;
import java.util.Date;

public class Problem25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		preparefibonacciListLessThan4Million();
	}
	
	public  static void preparefibonacciListLessThan4Million()
	{
		long tempTime = new Date().getTime();
		final BigInteger upperlimit = getTenPowerTen();
		int count = 3;
		System.out.println((new Date().getTime() - tempTime)/1000 + " seconds elapsed");
		
		BigInteger sum = new BigInteger("0") ;		
		BigInteger fibVariableOne = new BigInteger("1");
		BigInteger fibVariableTwo = new BigInteger("2"); 
		BigInteger fibVariableThree = new BigInteger("0");
	sum = sum.add( fibVariableTwo) ;// for the fibvariableTwo = 2 
			

				while(fibVariableThree.compareTo(upperlimit)<0)
				{count ++;
					fibVariableThree = fibVariableOne.add(fibVariableTwo);
					fibVariableOne = fibVariableTwo;
					fibVariableTwo = fibVariableThree;
				
					
					
				}
				
				System.out.println("sum is : " + fibVariableThree + " count is : " + count);
		
		
	}
	public static BigInteger getTenPowerTen()
	{
		
		BigInteger temp = new BigInteger("1");
		for(int i=0;i<999;i++)
		{
			temp = temp.multiply(BigInteger.TEN);
			
		}
		return temp;
		
	}

}
