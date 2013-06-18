package com.project.euler.net;

import java.util.HashSet;

public class Problem87 {

	/**

The smallest number expressible as the sum of a prime square, prime cube, and prime fourth power is 28. In fact, there are exactly four numbers below fifty that can be expressed in such a way:

28 = 22 + 23 + 24
33 = 32 + 23 + 24
49 = 52 + 23 + 24
47 = 22 + 33 + 24

How many numbers below fifty million can be expressed as the sum of a prime square, prime cube, and prime fourth power?

	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<50000000;i++)
		{
		Util.getDivisorsAsSet(i);
		}
	}


	public static HashSet<Long> getDistinctPrimeFactorsAsSet(long N)
	{
	HashSet<Long> primeFactorSet = new HashSet<Long>();
	HashSet<Long> divisorSet = Util.getDivisorsAsSet(N);
		
		for(long divisor : divisorSet)
		{
		if(Util.isPrime(divisor))
		{
		primeFactorSet.add(divisor);
		}
		}
		
		return primeFactorSet;
	}
}
