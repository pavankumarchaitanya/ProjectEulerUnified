package com.project.euler.net;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Util {

	static long runningTimeStart;


	public static boolean isPrime(long  Number)
	{//my code is below and commented, picked up a claimed faster running isprime from stack overflow
		//TODO: need to compare how fast/slow mine is as compared to the other one
		/* if(Number==2||Number==3)
			return true; 



		for(double i=2; i<= Number/2;i++)
		{
			if(Number%i==0)
				return false;

		}
		return true;
		 *
		 */
		long n = Number;

		if(n < 2) return false;
		if(n == 2 || n == 3) return true;
		if(n%2 == 0 || n%3 == 0) return false;
		long sqrtN = (long)Math.sqrt(n)+1;
		for(long i = 6L; i <= sqrtN; i += 6) {
			if(n%(i-1) == 0 || n%(i+1) == 0) return false;
		}
		return true;

	}

	public static long NthPrime(long  Number)
	{
		int countPrime =0;
		for(long i = 2; ;i++)
		{
			if(Util.isPrime(i))
				countPrime++;
			if(countPrime ==Number)
				return i;

		}


	}


	public int Max(Comparable varOne, Comparable varTwo)
	{
		if( varOne.compareTo(varTwo)>0)
		{
			return +1;
		}
		else return -1 ;





	}
	public static String doGet(String URLToGet,String urlParameters) throws IOException
	{
		String response="";
		URL myUrlObj = new URL(URLToGet);
	    URLConnection yc = myUrlObj.openConnection();
	    BufferedReader in = new BufferedReader(
	                            new InputStreamReader(
	                            yc.getInputStream()));
	    String inputLine;
	
	    while ((inputLine = in.readLine()) != null) 
	    {
	    	response = response+"\n" + inputLine;
	    }
	    //	System.out.println(response);
	    in.close();
	    
	    
		 
		
		return response;
	}

	public static String doPost(String URLToPost,String urlParameters) throws IOException
	{
		
		URL url = new URL(URLToPost);
		URLConnection conn = url.openConnection();
	
		conn.setDoOutput(true);
	
		OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());
	
		writer.write(urlParameters);
		writer.flush();
	
		String line,response="";
		BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	
		while ((line = reader.readLine()) != null) {
			response = response+"\n" + line;
		}
		writer.close();
		reader.close();   
		
		return response;
	}

	public static long sumOfFirstNPositiveNumbers(long n)
	{
		return (n*(n+1)/2);

	}

	public static int AddNumbersInAString(String S)
	{
		System.out.println("Length of String: " + S.length());
		int temp = 0; 
		for(int i=0; i < S.length(); i++)
		{
			temp += Integer.parseInt("" + S.charAt(i));
		}
		return temp;
	}

	public static Set<Long> getDivisorsAsSet(long number)
	{
		Set<Long> divisorSet = new HashSet<Long>();

		for(long i =1; i<= number/2; i++){
			if(number%i==0)
			{
				divisorSet.add(i);
			}
		}

		return divisorSet;


	}
	public static int NameScore(String s){
		int sum =0;
		for(int i = 0 ; i < s.length();i ++	)
		{
			sum += ( (s.charAt(i)+"").toLowerCase().charAt(0)-'a' + 1) ;
		}

		return sum;
	}
	public static BigInteger iPoweri(int i)
	{
		BigInteger temp = new BigInteger("1");
		BigInteger iObj = new BigInteger(""+i) ;

		for(int k = 0; k<i ; k++)
		{
			temp = temp.multiply(iObj);
		}

		return temp;

	}







	public static ArrayList<Long> firstNPrimes(int n)
	{
		ArrayList<Long> primeList = new ArrayList<Long>() ; 

		for(int i =1 ; i< n; i++)
		{
			primeList.add(Util.NthPrime(i));
		}
		return primeList;

	}
	public static ArrayList<Long> primesBelowN(int N)
	{
		ArrayList<Long> primesListBelowN = new ArrayList<Long>() ; 

		for(long i = 1;  ; i++)
		{

			if(isPrime(i) && i<N)
			{ primesListBelowN.add(i);
			}
			else if (i > N ){break;}
		}

		return primesListBelowN;
	}

	public static ArrayList<BigInteger> getDistinctPrimeFactorsOf(BigInteger n)
	{ //TODO:
		ArrayList<BigInteger> distinctPrimeFactorsList = new ArrayList<BigInteger>();

		int i =1;
		BigInteger tempPrime =new BigInteger(NthPrime(i)+"");
		while(tempPrime.compareTo(n.divide(new BigInteger(2+"")))==-1)
		{
			if(n.mod(new BigInteger(tempPrime+"")).equals(new BigInteger(0+"")))
			{
				distinctPrimeFactorsList.add(tempPrime);
				System.out.println(tempPrime);
			}
			i++;
			tempPrime = new BigInteger(NthPrime(i)+"");

		}
		return distinctPrimeFactorsList;

	}


	public static BigInteger getFactorial(int n)
	{
		if(n==1)
			return new BigInteger(""+ 1);
		else return (new BigInteger(""+n)).multiply(getFactorial(n-1));

	}

	public static HashSet<Long> getDigitsAsSet(long i)
	{
		HashSet<Long> digitSet = new HashSet<Long>();
		while(i>0)
		{
			digitSet.add(i%10);
			i=i/10;


		}

		return digitSet;

	}

	public static void StartCalculatingRunningTime()
	{
		Date date=new Date();
		runningTimeStart = date.getTime();

	}

	public static void GetRunnningTime()
	{
		Date date=new Date();
		if((date.getTime() - runningTimeStart)/1000>0)
		System.out.println("Running Time is : " + (date.getTime() - runningTimeStart)/1000 +" seconds");
		else
			System.out.println("Running Time is : " + (date.getTime() - runningTimeStart) +" Milli seconds");

	}

	public static boolean isProductPanDigital(long i,long j, long l)
	{
		//must not have a 0;


		if((i+"").contains("0")||(l+"").contains("0")||(j+"").contains("0") )
		{
			return false;
		}

		HashSet<Long> numberSet = new HashSet<Long>();



		numberSet=	Util.getDigitsAsSet(i);
		numberSet.addAll(Util.getDigitsAsSet(j));
		numberSet.addAll(Util.getDigitsAsSet(l));


		if(((i+"").length()+(j+"").length()+(l+"").length())==9 && numberSet.size()==9)
		{
			return true;

		}

		return false;
	}


	public static boolean isPanDigital(long l)
	{
		//must not have a 0;


		if((l+"").contains("0"))
		{
			return false;
		}


		if(!((l+"").contains("1")&&(l+"").contains("2")&&(l+"").contains("3")&&(l+"").contains("4")&&(l+"").contains("5")&&(l+"").contains("6")&&(l+"").contains("7")&&(l+"").contains("8")&&(l+"").contains("9")))
		{
			return false;
		}


		//HashSet<Long> numberSet = new HashSet<Long>();




		//numberSet.addAll(Util.getDigitsAsSet(l));


		if(((l+"").length())==9 )//&& numberSet.size()==9)
		{
			return true;

		}

		return false;
	}

	public static ArrayList<String> readFromFileAndReturnAsStringList(String Filename)
	{
		ArrayList<String> fileContent = new ArrayList<String>();
		try{

			FileInputStream fstream = new FileInputStream(Filename);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;

			while ((strLine = br.readLine()) != null)   {
				fileContent.add(strLine);					//read the entire file into an arraylist of strings, each line of file is one corresponding element in the arraylist
			}
			in.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}	

		//	for(int i = 0; i < fileContent.size();i++)
		//	System.out.println(fileContent.get(i));


		return fileContent;
	}
	
	

public static boolean isPalindrome(String S)
{
for(int i=0; i < S.length(); i ++)
{
if(S.charAt(i)==S.charAt(S.length()-i-1))
{

}
else
{
return false;
}

}
return true;
} 

public static String Reverse(String S)
{
	StringBuffer temp = new StringBuffer("");
	
	for(int i=S.length()-1;i>=0;i--)
	{
		temp.append(S.charAt(i));
	}
	
	
	
	return temp.toString();
}
}


