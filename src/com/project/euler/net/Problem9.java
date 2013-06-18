package com.project.euler.net;

public class Problem9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
	//	a2 + b2 = c2

	//	For example, 32 + 42 = 9 + 16 = 25 = 52.

	//	There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	//	Find the product abc.

		int a,b,c;
		for( a=0;a<1000;a++)
		{
			for( b =0 ; b< 1000; b++)
			{
				c = 1000-a-b;
				if((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2))<0.00001)
					{System.out.println("a,b,c : " );
					System.out.println(a);
					System.out.println(b);
					System.out.println(c);
					System.out.println("a*b*c : " + a*b*c );
					
					}
					
			}
		}
	}

}
