import com.project.euler.net.Util;


public class Problem74 {
	 static long FactorialArray [] = new long[10] ; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		for(int i=1;i<10;i++)
		{
			 FactorialArray[i] =Long.parseLong(Util.getFactorial(i).toString());
		}
		
		
		
		
		
		
		
		for (int index = 99999999; index >= 10; index--) {
			int sum = 0;
			int count = 0;
			int firstDigit = index;
			String digits = index+"";
			while (count <= 60) {
				
				
				for(int index1=digits.length()-1;index1>=0;index1--){
					sum += FactorialArray[digits.charAt(index1)];
				}
				count++;
				if(sum != firstDigit && count == 60){
					break;
				}else if(sum == firstDigit && count == 60){
					System.out.println(sum);
					break;
				}
				digits = sum+"";
			}
		}
		
	}
	
	
	
	static int getNumberOfNonRepeatingTerms(int i)
	{int num=0;
	
	
	return num ;
	
	}
	
	
	

}
