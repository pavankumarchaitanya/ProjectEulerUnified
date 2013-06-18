package com.project.euler.net;

import java.util.HashSet;

public class Tools {

	
	public static String getBinaryStringOfInteger(int number )
	{ 
		StringBuffer Temp = new StringBuffer(); 
		
		//Temp = Temp.append(number%2);
		while(number/2!=0)
		{
			Temp = Temp.append(number%2);
			number = number/2;
			
		}
		Temp = Temp.append(number%2);
		
		
		return Temp.reverse().toString();
	}
	
	public static boolean isPalindrome(String input)
	{
		int i=0;
		
		int stringSize=input.length();
		int j =stringSize-i-1;
		while(i >=0 && j>=0  && input.charAt(i)==input.charAt(j) )
		{
			if(i <j)
			{
		i++;
		j= stringSize-i-1;
			}else
			{
			return true;
			}
		}
		
		
		return false;
		
	}
	
	
	public static boolean isPanDigital(HashSet<Integer> set){
		if(set.size()==10)
		{
		for(int i =0; i <=9; i++)
		set.remove(new Integer(i));
		}
		else
			return false;
		
		
		if (set.size() > 0)
		return false;
		else return true;
		
		
	}
	
	public static void main(String []  args)
	{
		//System.out.println(getBinaryStringOfInteger(33));
		//System.out.println(isPalindrome("acbca"));
	HashSet<Integer> set = new HashSet<Integer>(); 
	
	for(int i =0; i <=1; i++)
		set.add(new Integer(i));
	
	System.out.println("Set is Pandigital : " + isPanDigital(set));
		
		
	}
	
	
}
