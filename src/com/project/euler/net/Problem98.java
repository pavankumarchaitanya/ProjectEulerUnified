import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.project.euler.net.Util;


public class Problem98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	List<String> fileAsList =	Util.readFromFileAndReturnAsStringList("words.txt");
	
	String str = fileAsList.get(0);
	
	StringTokenizer st = new StringTokenizer(str,",");
	List<String> wordList = new ArrayList<String>();
	while(st.hasMoreElements())
	{
	wordList.add(((String)st.nextElement()).replace("\"", ""));
	}
	for(String word : wordList)
	{
	Util.getCharacterSetFromString(word);
	}
	System.out.println();
	}

}
