package com.project.euler.net;

import java.util.ArrayList;
import java.util.HashSet;

import com.project.euler.net.Utility.Util;


public class Problem47 {
//Every number can be expressed in the form of distinct primes, we have to run through the list of primes until we get all prime factors for a given number. 
	// look till n/2 numbers for prime factors. exclude primes from the list of number being looked up. 
	
	public static void main(String args[])
	{
		ArrayList<Long> firstNPrimeList = Util.firstNPrimes(1000);
	HashSet<Long> PrimeSet = new HashSet<Long>(firstNPrimeList);
	
	
	}
	
}
