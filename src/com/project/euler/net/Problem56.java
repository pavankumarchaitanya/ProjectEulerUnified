import java.math.BigInteger;


public class Problem56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long largestSum = 0; 
		
		for(int a=1;a<100;a++)
		{
			for(int b=1;b<100;b++)
			{
				BigInteger A = new BigInteger(a+""),B = new BigInteger(b+"");
				
				BigInteger Result = A.pow(b);
				if(largestSum<SumOfDigitsInAString(Result.toString()))
				{
					largestSum = SumOfDigitsInAString(Result.toString());
					
				}
					
					
			System.out.println(SumOfDigitsInAString(Result.toString()));
			System.out.println("a : " + a + "b : "  + b);	
			}
		}
		System.out.println(largestSum);
	}
	
	public static long SumOfDigitsInAString(String S)
	{
		char [] temp =S.toCharArray();
		long sum =0;
		for(char c : temp)
		{
			sum = sum + Integer.parseInt(c+"");
		}
		return sum;
	}
	

}
