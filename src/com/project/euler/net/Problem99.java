package com.project.euler.net;

import java.util.ArrayList;

public class Problem99 {

	/**

Comparing two numbers written in index form like 211 and 37 is not difficult, as any calculator would confirm that 211 = 2048 < 37 = 2187.

However, confirming that 632382518061 > 519432525806 would be much more difficult, as both numbers contain over three million digits.

Using base_exp.txt (right click and 'Save Link/Target As...'), a 22K text file containing one thousand lines with a base/exponent pair on each line, determine which line number has the greatest numerical value.

NOTE: The first two lines in the file represent the numbers in the example given above.

	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> fileContent = Util.readFromFileAndReturnAsStringList("base_exp.txt");
		double max = 0;
		int maxindex =0 ;
		for(int i=0;i<fileContent.size();i++)
		{
			String base = fileContent.get(i).split(",")[0];
			String exponent = fileContent.get(i).split(",")[1];
			long baseNum = new Long(base);
			long exponentNum = new Long(exponent);
			if((exponentNum*(Math.log(baseNum))) > max)
					{
				
				max=exponentNum*(Math.log(baseNum));
				System.out.println(max);
				maxindex = i+1;
					}
		}
		System.out.println(maxindex);
	}

}
