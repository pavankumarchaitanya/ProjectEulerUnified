package com.project.euler.net;

import java.util.ArrayList;

public class Problem50 {

	/**
The prime 41, can be written as the sum of six consecutive primes:
41 = 2 + 3 + 5 + 7 + 11 + 13

This is the longest sum of consecutive primes that adds to a prime below one-hundred.

The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.

Which prime, below one-million, can be written as the sum of the most consecutive primes?
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Util.StartCalculatingRunningTime();
			ArrayList<Long> listOfPrimes =  	Util.primesBelowN(1000000);
			
			for(int i= 1; i<listOfPrimes.size();i++)
			{
				//if(Util.isPrime(listOfPrimes.get(i)+ listOfPrimes.get(i-1))&& (listOfPrimes.get(i)+ listOfPrimes.get(i-1) < 1000000))
				//	System.out.println(listOfPrimes.get(i)+ listOfPrimes.get(i-1));
				listOfPrimes.set(i, listOfPrimes.get(i)+ listOfPrimes.get(i-1));
				
				
				}
			for(int i=listOfPrimes.size()-1;i>=0;i--)
			{
			for(int j=0;j<i;j++)
			{
				if(Util.isPrime(listOfPrimes.get(i)-listOfPrimes.get(j))&& (listOfPrimes.get(i)-listOfPrimes.get(j) < 1000000))
				{
					System.out.println(listOfPrimes.get(i)-listOfPrimes.get(j));
					Util.GetRunnningTime();
					System.exit(0);
				}
			}
			}	
		
		
		
	}

}
