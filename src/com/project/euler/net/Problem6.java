package com.project.euler.net;

public class Problem6 {
//	The sum of the squares of the first ten natural numbers is,
//	12 + 22 + ... + 102 = 385

//	The square of the sum of the first ten natural numbers is,
//	(1 + 2 + ... + 10)2 = 552 = 3025

//	Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.

//	Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	
	public static void main(String args[])
	{
		int i = 100;
		System.out.println(Math.abs(sumOfSquares(i)-squaresOfSum(i)));
		
	}
	public static long sumOfSquares(int n)
	{
		long sum = 0;
		for(int i = 0; i<= n; i++)
			sum+= i*i;
		return sum;
		
	}
	public static long squaresOfSum(int n)
	{
		long sum =0;
		for (int i =0;i<=n;i++)
			sum+=i;
		return (long) Math.pow(sum, 2);
		
	}

}
