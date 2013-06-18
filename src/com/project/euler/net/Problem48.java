package com.project.euler.net;

import java.math.BigInteger;

public class Problem48 {

	/**
	 * @param args
	 * The series, 11 + 22 + 33 + ... + 1010 = 10405071317.

Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigInteger sum = new BigInteger("0");
		for(int i =1; i<= 1000; i++)
		{
			sum = sum.add(Util.iPoweri(i));
			
		}
		int length = sum.toString().length();
		
		System.out.println(sum.toString().substring(sum.toString().length()-10, sum.toString().length()));
		
		System.out.println(Util.iPoweri(2));
		System.out.println(Util.iPoweri(3));
	}

}
