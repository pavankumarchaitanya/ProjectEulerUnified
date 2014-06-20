import com.project.euler.net.Util;


public class Problem40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bruteForce();
//alternate();
	}
	
	
public static void	bruteForce(){
	
	Util.StartCalculatingRunningTime();
	StringBuffer sb = new StringBuffer();
		for(int i=1;i<=1000000; i++)
		{
			sb.append(i);
			
		}
		
		int product = Integer.parseInt(sb.toString().charAt(0)+"")*Integer.parseInt(sb.toString().charAt(9)+"")*Integer.parseInt(sb.toString().charAt(99)+"")*Integer.parseInt(sb.toString().charAt(999)+"")*Integer.parseInt(sb.toString().charAt(9999)+"")*Integer.parseInt(sb.toString().charAt(99999)+"")*Integer.parseInt(sb.toString().charAt(999999)+"");
		
		System.out.println(product);
		
		Util.GetRunnningTime();
	}

public static void	alternate(){
	//use a string buffer, this one's taking forever
	
	Util.StartCalculatingRunningTime();
	String sb = new String();
		for(int i=1;i<=1000000; i++)
		{
			sb = sb +(i);
			
		}
		
		int product = Integer.parseInt(sb.toString().charAt(0)+"")*Integer.parseInt(sb.toString().charAt(9)+"")*Integer.parseInt(sb.toString().charAt(99)+"")*Integer.parseInt(sb.toString().charAt(999)+"")*Integer.parseInt(sb.toString().charAt(9999)+"")*Integer.parseInt(sb.toString().charAt(99999)+"")*Integer.parseInt(sb.toString().charAt(999999)+"");
		
		System.out.println(product);
		
		Util.GetRunnningTime();
	}

}
