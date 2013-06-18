package com.project.euler.net;

public class Problem4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

		//		Find the largest palindrome made from the product of two 3-digit numbers.
	//	100 X 100
	//	999X999
		
	//	System.out.println("909909 : " + checkIfPalindrome("909909"));
		boolean flag = false;
		int maxPalindrome = 0;
		int temp;
		for(int i=999;i >=100; i--)
		{
			for(int j = 999; j>=100; j--)
			{
				temp = i*j;
				if(checkIfPalindrome(new Integer(temp).toString()))
				{
					if(maxPalindrome<temp)
						{maxPalindrome=temp;
					System.out.println(temp);
						}
					flag = true;
					
				}
				
				
			}

		}
		System.out.println("maxPalindrome"+ maxPalindrome); 

	}
	public static boolean checkIfPalindrome(String tempString)
	{
		int len = tempString.length()-1;
		for(int i=0;i<tempString.length();i++)
		{
			if(tempString.charAt(i)!=tempString.charAt(len-i))
				return false;
				
			
		}
		return true;
		
	}

}
