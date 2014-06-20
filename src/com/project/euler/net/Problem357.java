import java.util.HashSet;
import java.util.Set;

import com.project.euler.net.Util;
/*
 * Consider the divisors of 30: 1,2,3,5,6,10,15,30.
It can be seen that for every divisor d of 30, d+30/d is prime.

Find the sum of all positive integers n not exceeding 100 000 000
such that for every divisor d of n, d+n/d is prime.
 */

public class Problem357 {
public static void main (String args[])
{
	Util.StartCalculatingRunningTime();
//	Util.primesBelowN(100000000);
	Util.GetRunnningTime(); //167 seconds

	
	Util.StartCalculatingRunningTime();
Set<Integer> probableSet = new HashSet<Integer>();
Set<Integer> ignoreSet = new HashSet<Integer>();
 double limit= Math.sqrt(100000000);
for (int i=1; i< 100000000;i=i+2)
{
	if (ignoreSet.contains(i))
		continue;
	
	for(int j=2;j<(int)limit;j++)
	{
		int temp = j*i*i;
		if (temp < 100000000)
		ignoreSet.add(temp);
	}
	
	if (i%10000==0)
		System.out.println(i);
	
probableSet.add(i);
	
}
Util.GetRunnningTime(); 

// eliminate with 1 - 1+21/1 =22, 1+ 23/1 = 24 , cannot be prime, so all odd numbers can be eliminated.  
// reduce solution set with 2, for all multiples of 4, 2+(4*k)/2 == 2(1+2*k/2) which is even and not prime.
// for 3 : 3+3*k/3 == 3(1+k/3) for k= 3 z, 3(1+k/3)==3(1+z) which is not prime. so for multiples of 3^2, d+n/d is not prime.
//so on and so forth. 
}
}
