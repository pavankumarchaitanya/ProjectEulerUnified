package com.project.euler.net;

import javax.lang.model.type.PrimitiveType;

public class Problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	The prime factors of 13195 are 5, 7, 13 and 29.

	//	What is the largest prime factor of the number 600851475143 ?
		long temp = 600851475143L;
System.out.println ("Largest Prime factor of " + temp+ " is: " + LargestPrimeFactor(temp));
		
	}

	public static 	double	LargestPrimeFactor(long  number){
		long  tempPrime=2;
		long  max  =0 ; 
		while(tempPrime < number/2)
		{
			System.out.println("Processing " + tempPrime);
		 if(isPrime(++tempPrime))
		 {
			 if(number%tempPrime ==0 && max < tempPrime)
			 {max = tempPrime;
			 System.out.println(max);
			 }
			 
		 }
			
		}
		return max;
		
	}
	public static boolean isPrime(long  Number)
	{
		for(double i=2; i<= Number/2;i++)
		{
			if(Number%i==0)
				return false;
			
		}
		return true;
		
	}
}
