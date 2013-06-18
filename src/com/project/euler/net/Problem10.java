package com.project.euler.net;

public class Problem10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
long sum  = 0;
		for(int i=2;i<2000000;i++)
		{
			if(Util.isPrime(i) )
			{
				sum+=i;
				System.out.println(i);

			}

		}

		System.out.println("Sum is :" +sum);
		
		
		
		
	}
}
/*
public static void primeNumbersList()
{int sum = 2+3 ; 
	for(int i=4;i<2000000; i++)
	{
		if(Util.isPrime(6*i-1))
			sum += 6*i-1 ; 
		if(Util.isPrime(6*i+1))
			sum += 6*i+1 ; 
	}
}
*/
