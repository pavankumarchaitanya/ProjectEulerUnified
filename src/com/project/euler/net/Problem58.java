package com.project.euler.net;

import java.util.ArrayList;
import java.util.HashSet;

public class Problem58 {

	/**
	 * @param args
	 * 37 36 35 34 33 32 31
38 17 16 15 14 13 30
39 18  5  4  3 12 29
40 19  6  1  2 11 28
41 20  7  8  9 10 27
42 21 22 23 24 25 26
43 44 45 46 47 48 49



1
3
5
7 elements per square

2n-1 x 2n-1 

(2n-1)/2 - starting point 1.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	N=1;
		float ratio=1;
		int PrimeCount=0, NonPrimeCount=0;
		while(ratio > (.10))
		{
		N++; //starts with N=0+1;
		if(Util.isPrime((long)((2*N-1)*(2*N-1)-2*(N-1))))
		PrimeCount++;
		else
		NonPrimeCount++;

		NonPrimeCount++; //for (2n-1)(2n-1)

		if(Util.isPrime((long)((2*N-1)*(2*N-1)-2*(N-1)-2*(N-1))))
		PrimeCount++;
		else
		NonPrimeCount++;

		if(Util.isPrime((long)((2*N-1)*(2*N-1)-2*(N-1)-2*(N-1)-2*(N-1))))
		PrimeCount++;
		else
		NonPrimeCount++;

		ratio = (float)PrimeCount/(PrimeCount+NonPrimeCount);
		System.out.println("Processing N : " + N);
		}
		System.out.println((2*(N-1)-1)); // use n-1th element , because the ratio crossed 0.1 for n
	}


public static ArrayList<ArrayList<Integer>> getNumberCubeOfNLayers(int n)
{
	ArrayList<ArrayList<Integer>> PrimeBox = new ArrayList<ArrayList<Integer>>();
	int count =1; 
	while(count <= (2*n+1)*(2*n+1))
	{
		
		
	}
	return PrimeBox;
}

public static HashSet<Long> getCornersOfSquaresForSideN(int N)
{
HashSet<Long> set = new HashSet<Long>();

set.add((long)(2*N-1)*(2*N-1));
set.add((long)(2*N-1)*(2*N-1)-2*(N-1));
set.add((long)(2*N-1)*(2*N-1)-2*(N-1)-2*(N-1));
set.add((long)(2*N-1)*(2*N-1)-2*(N-1)-2*(N-1)-2*(N-1));

return set;
}
}

