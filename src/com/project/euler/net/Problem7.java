package com.project.euler.net;
import com.project.euler.net.Util;
public class Problem7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println(Util.isPrime(4));
System.out.println(NthPrime(10001));
	}

	public static long NthPrime(long  Number)
	{
		int countPrime =0;
				for(long i = 2; ;i++)
				{
					if(Util.isPrime(i))
						countPrime++;
					if(countPrime ==Number)
						return i;
					
				}
				
		
	}
}
