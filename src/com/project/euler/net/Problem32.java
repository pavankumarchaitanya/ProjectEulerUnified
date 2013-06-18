package com.project.euler.net;

import java.util.HashSet;

public class Problem32 {
/*
 * 

We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.

The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, multiplier, and product is 1 through 9 pandigital.

Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.
HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum.

 */
	public static void main(String args[])
	{
		
		Util.StartCalculatingRunningTime();
		
	long	sum =0;
	HashSet<Long> SumSet = new HashSet<Long>(); 
		
		for(long i=0; i<1000000;i++)
			
		{
			
			for(long j=0;j<=1000000;j++)
			{
				if(((i+"").length()+(j+"").length()+ (i*j+"").length()) >9)
				{
					break;
				}
				if(i<j &&  Util.isProductPanDigital(i, j, i*j) )
				{
					
					if(!SumSet.contains(new Long(i*j)) )
					{
					SumSet.add(new Long(i*j));
						sum = sum + i*j;
						System.out.println(i +" * " + j + " = " + (i*j));
					}
					
					
					
				}
				
				
			}
			
			
		}
		
		System.out.println("sum " + sum);
		
		Util.GetRunnningTime();
		
	}
	
	
}
