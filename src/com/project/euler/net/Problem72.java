import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.project.euler.net.Util;


public class Problem72 {
	static ArrayList<Long>  listOfPrimes = Util.primesBelowN(1000000);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
bruteForce();
	}

	public static void alternate()
	{

		int upperLimit = 1000000;
		
		ArrayList< Set<Long>> array = new ArrayList<Set<Long>>();
		long count=0;
		
		for(long i=0;i<=upperLimit;i++){
			System.out.println(i);
			array.add(getDistinctPrimeFactorsOf(i));
		}
		
		for(int i=2;i<=upperLimit;i++)
			for(int j=i-1;j>0;j--)
			{System.out.println(i);
				Set<Long> intersection = new HashSet<Long>(array.get(i));
				int temp = intersection.size();
				
				intersection.removeAll(array.get(j));
			//	intersection.retainAll(array.get(j));
		//		if(intersection.size()==0)
			if(temp!=intersection.size())
					count++;
					
			}
		
		System.out.println("test : "+ count);
	}
	public static  Set<Long> getDistinctPrimeFactorsOf(long n)
	{

        Set<Long> distinctPrimeFactorsSet = new TreeSet<Long>();

        if(n==0)
        	return distinctPrimeFactorsSet;
      for(long l : listOfPrimes)
      {
    	  if(l<=n && n%l==0)
    	  {
    		  distinctPrimeFactorsSet.add(l);
    	  }else if (n<l) break;
    	  
      }
        return distinctPrimeFactorsSet;
	}	
	public static void bruteForce()
	{
		HashSet<Double> set = new HashSet<Double>();
		int upperLimit = 1000000;

				for(double i=2;i<=upperLimit;i++)
					for(double j=i-1;j>0;j--)
					{
						System.out.println(i);
						set.add(Math.ceil((j/i)*100000000));
					}
				
				System.out.println("Size : " +set.size());
	}
}
