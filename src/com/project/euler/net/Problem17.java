package com.project.euler.net;

public class Problem17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] NumberSpellingArrayTillTwenty = new String []{"One", "Two", "Three", "Four", "Five","Six","Seven","Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen","Fourteen","Fifteen", "Sixteen", "Seventeen", "Eighteen", "NineTeen","Twenty"};
		String [] MultiplesofTenSpellingArray = new String[]{"Unused","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

StringBuffer toCountCharacters = new StringBuffer();

		for(int i =1 ; i<1000; i++)
		{

			System.out.println(getSpellingWithinThousand(i));
			
			toCountCharacters.append(getSpellingWithinThousand(i));


		}
		String NsObj = toCountCharacters.toString() + "ONE THOUSAND";
		System.out.println(NsObj.replaceAll(" ", "").length());
		//ONETHOUSAND
	}


	public static String getSpellingWithinThousand( int i )
	{
		String tempString =""; 
		if(i/100 >= 1)
		{
			tempString = tempString.concat(getHundredsSpelling(i)) ;
		}		
		
		

		if(i/10 >= 2)
		{
			if(tempString.length()!=0 && i %100 !=0)  //for hundred AND one two three texts 
				tempString = tempString.concat(" and ");
			
			tempString = tempString.concat(getTensSpelling(i));
		}
		
		if ((i)<20 || i%10 !=0){ // less than or equal to twenty
			tempString = tempString.concat(getUnderTwentySpelling(i));
		}




		return tempString;
	}
	public static String getHundredsSpelling(int i)
	{
		String [] HundredsSpellingArray = {"", "One", "Two", "Three", "Four", "Five","Six","Seven","Eight", "Nine"};
		if(i/100 == 0)
		{
			return "" ;
		}else
		{
			return HundredsSpellingArray[i/100] + " Hundred "  ;

		}



	}

	public static String getTensSpelling(int i)
	{
		String [] MultiplesofTenSpellingArray = new String[]{"Ten","Twenty ","Thirty ","Forty ","Fifty ","Sixty ","Seventy ","Eighty ","Ninety "};
i = i%100;
		if(i/10 == 0 || (i>10 && i < 20) )
		{
			return "" ;
		}else
		{
			return MultiplesofTenSpellingArray[i/10-1] ;

		}

	}

	public static String getUnderTwentySpelling(int i)
	{
		String [] NumberSpellingArrayTillTwenty = new String []{"One", "Two", "Three", "Four", "Five","Six","Seven","Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen","Fourteen","Fifteen", "Sixteen", "Seventeen", "Eighteen", "NineTeen","Twenty"};
		
		i = i%100;
		
		if(i<=20  )
		{
			return NumberSpellingArrayTillTwenty[i-1] ;

		}
		
		else return NumberSpellingArrayTillTwenty[i%10-1] ;

	}



}