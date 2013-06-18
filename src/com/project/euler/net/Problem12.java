package com.project.euler.net;

public class Problem12 {
static int max = 0;
static long maxI= 0;
	/**
	 * @param args
	 */
//Number of factors for : 5984 are 479Max number of factors is :479
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
for(long i =500; ;i=1+i)
{
	 temp = numberOfFactors(Util.sumOfFirstNPositiveNumbers(i));
	if(max<temp)
	{max=temp;
	maxI = i;
	System.out.println("Number of factors for : " + maxI +" are "+ max + "Max number of factors is :" + max);
	}
	if(temp>500)
		{
		System.out.println("Triangle number is :"+ Util.sumOfFirstNPositiveNumbers(i));
		break;
		}
}


	

}


public static int numberOfFactors(long number)
{
	int count = 0;
for(int i=1; i<=number/2; i++)
{
if(number%i==0)
	{
	
	count++;
	}

}
//System.out.println("Number of factors : " + count +"for "+ number + "Max number of factors is :" + max);
return count;
	
}

}