package com.project.euler.net;
import java.io.ObjectInputStream.GetField;



public class Problem36 {

	
	
	public static void main(String args[])
	{
		long sum = 0;
		for(int i=0; i < 1000000; i++)
		{
			if(Tools.isPalindrome(new Integer(i).toString()) && Tools.isPalindrome(Tools.getBinaryStringOfInteger(i)))
			{
				System.out.println(i + " is palindrome in both base 10 and 2 ");
				sum = sum+i;
			}
			
		}
		System.out.println("Sum is " + sum);
		
		
	}
}
