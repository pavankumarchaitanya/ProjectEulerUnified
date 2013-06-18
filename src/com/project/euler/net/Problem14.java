package com.project.euler.net;

public class Problem14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max =0,temp = 0,maxChainProducingNumber = 1;
		
for (int i = 1;i<1000000; i ++)
{
	temp = runSequenceAndReturnCount(i);
	if(max < temp)
	{
	max = temp;
	maxChainProducingNumber = i;
	}
	
	
}
		System.out.println("Max is :" + max + " and the largest chain producing number is" + maxChainProducingNumber);
	}
	
	public static int runSequenceAndReturnCount(int i)
	{int count =0;
		long temp = i;
		
		while(temp!=1)
		{
			if(temp%2==0)
				temp=temp/2;
			else
				temp = temp*3+1;
			count++;
		}
		return count;
		
	}

}
