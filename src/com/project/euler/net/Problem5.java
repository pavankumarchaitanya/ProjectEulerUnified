package com.project.euler.net;

public class Problem5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long temp = 1;
		boolean flag = true;
for(int i=1;i<=20; i++)
	temp=temp*i;
long lcm  =temp;
System.out.println(temp);
for(long j = 1 ; j <lcm; j++)
{
for(long k=1; k <= 20; k++)	
{ 
if(j%k != 0)
	{ 
	flag = false;
	break;
	}
flag = true;
}
if(flag == true)
	{System.out.println(j);
	break;
	}

}


	}

}
