package com.project.euler.net;

import java.util.HashSet;

public class Problem45 {
public static void main(String args [])
{
///	 System.out.println(2873*(2873+1)/2);
//	 System.out.println(1437*(2*1437-1)/2);
//	 System.out.println(567561*(567561-1)/2);
	long n1,m1,l1;
	Util.StartCalculatingRunningTime();
	HashSet<Long> LValue = new HashSet<Long>();
	for(long l=1; l<=1000000; l++){
    	
	    l1= (l*(3*l-1)/2);
	    LValue.add(l1);
	}
	 
	 
	HashSet<Long> NValue = new HashSet<Long>();
	for(long n=1; n<=1000000; n++){
	    n1= (n*(n+1)/2);
	    NValue.add(n1);
	} 
	 
	 HashSet<Long> MValue = new HashSet<Long>();
	  for(long m=1; m<=1000000; m++){
	    m1= (m*(2*m-1));
	    MValue.add(m1);
	} 	
	  
	  LValue.retainAll(NValue);
	  LValue.retainAll(MValue);
	  Util.GetRunnningTime();
	  System.out.println(LValue);
	 
}
}
