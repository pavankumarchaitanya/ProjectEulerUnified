package com.project.euler.net;

import java.util.HashSet;

public class Problem44 {

	public static void main(String args[])
	{
		int size =100000;
		long [] pentNumArray = new long[size];
		HashSet<Long> pentNumSet = new HashSet<Long>();
		for(int i=0; i < pentNumArray.length;i++)
		{  	pentNumSet.add(getPentagonalNumber((long)i));
			pentNumArray[i]= getPentagonalNumber((long)i);
			
		}
		pentNumSet.remove(new Long(0));
		for(int i = 1;i<pentNumArray.length;i++)
		{
			for(int j=1;j<pentNumArray.length;j++)
			{
				if(pentNumSet.contains(Math.abs(pentNumArray[i]-pentNumArray[j])))
				{
					if(pentNumSet.contains(pentNumArray[i]+pentNumArray[j]))
					{
						System.out.println(pentNumArray[i] + " , " + pentNumArray[j]);
					}
				}
			}
		}
		System.out.println("Done");
	}
	public static long getPentagonalNumber(long n)
	{
		return n*(3*n-1)/2;
	}
}
