package com.project.euler.net;

import java.math.BigInteger;

public class Problem55 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

int count = 0;
for(int i=1;i <10000;i++ )
{
BigInteger sum;
BigInteger num = new BigInteger(i+"");
boolean isNonLycheral = false;
for(int j=0;j<50;j++)
{ //50 iterations

 sum = (new BigInteger(num+"")).add(new BigInteger(Util.Reverse(num+"")));
 num = sum;
 if(Util.isPalindrome(sum+""))
 {
 isNonLycheral = true;
 System.out.println(sum);
 break;
 }
}

if(isNonLycheral == false)
count++;

}

System.out.println("Non Lycheral count : " + count);
	}

}
