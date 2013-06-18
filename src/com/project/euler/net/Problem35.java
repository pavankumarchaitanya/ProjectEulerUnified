package com.project.euler.net;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Problem35 {

	/**
	 * @param args
	 * The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.

There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.

How many circular primes are there below one million?
	 * @throws FileNotFoundException 

	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		ArrayList<Integer> tempList;
		int count=0;
		boolean IsCircularPrimeflag = false; 
		for(int i = 2; i < 1000000;i++)
		{	
			if(i%1000==0)
			System.out.println("Working with: " + i);
			if (Util.isPrime(i))
			{
				tempList = (ArrayList<Integer>) getCircularRotationsAsList(i);
				IsCircularPrimeflag = true;
				for(int j =0; j < tempList.size();j++)
				{ 
					if(!Util.isPrime(tempList.get(j)))
						IsCircularPrimeflag = false;
				}
				if(IsCircularPrimeflag==true)
				{
					count++;
				}
				if( count%1000 == 0 )
				{
					
					
					PrintWriter pw = new PrintWriter(new File("CircularRotations.txt"));
					pw.println("count = " + count + "IsPrime for i = " + i);
					pw.close();
					
				}
			}
			
		}

		System.out.println("Number of Circular Primes below One Million:" + count);
	}

	public static List <Integer> getCircularRotationsAsList(int number)
	{ArrayList<Integer> listOfRotations = new ArrayList<Integer>();

	String numberString = number+"";
	String tempString = "";
	for(int i=0; i < numberString.length();i++)
	{
		for(int j =0; j< numberString.length();j++){
			tempString = tempString + numberString.charAt((i+j)%numberString.length());
		}
		listOfRotations.add(Integer.parseInt(tempString));
		tempString = "";
	}

	return listOfRotations;
	}
}
