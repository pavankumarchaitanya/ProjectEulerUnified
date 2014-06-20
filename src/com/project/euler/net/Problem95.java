import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.project.euler.net.Util;


public class Problem95 {

	public static void main(String[] args){
	long UpperLimit = 1000000;
	
		Util.primesBelowN(UpperLimit);
		
		Map<Long,List<Long>> listOfFactors = new HashMap<Long,List<Long>>();
		Util.StartCalculatingRunningTime();
		for(long i=1;i<1000000;i++){
			if(i%5000==0)
				System.out.println(i);
			listOfFactors.put(i, findFactor(i));
		}
	Util.GetRunnningTime();
	}
	
	BruteForce()
	public static List<Long> findFactor(long number){
		
		List<Long> factorsList = new ArrayList<Long>();
		for(long i=1;i<=number/2;i++){
			if(number%i == 0)
				factorsList.add(i);
		}
		
		return factorsList;
	}
	
	public static List<Long> findFactorsOf(long number)
	{
		List<Long> factorsList = new ArrayList<Long>();
	
		
	return factorsList;
		
		
	}
}
