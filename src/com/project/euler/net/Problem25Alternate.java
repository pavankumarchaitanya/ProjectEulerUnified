
public class Problem25Alternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count =0;
for(int i =0; i<=9;i++)
{
	for(int j =0; j<=9;j++)
	{
		if (i==j)
			continue;
		for(int k =0; k<=9;k++)
		{
			if (j==k||i==k)
				continue;
			for(int l =0; l<=9;l++)
			{if (l==k||l==j||l==i)
				continue;
				for(int m =0; m<=9;m++)
				{if (m==k||m==j||m==i||m==l)
					continue;
					for(int n =0; n<=9;n++)
					{
						if (n==k||n==j||n==i||n==l||n==m)
							continue;
						for(int o =0; o<=9;o++)
						{
							if (o==k||o==j||o==i||o==l||o==m||o==n)
								continue;
							for(int p =0; p<=9;p++)
							{
								if (p==k||p==j||p==i||p==l||p==m||p==n||p==o)
									continue;
								for(int q =0; q<=9;q++)
								{
									if (q==k||q==j||q==i||q==l||q==m||q==n||q==o||q==p)
										continue;
									for(int  r=0; r<=9;r++)
									{
										if (r==k||r==j||r==i||r==l||r==m||r==n||r==o||r==p||r==q)
											continue;
										
										
										count++;
										System.out.println(count);
										if(count==1000000)
											{System.out.print(i);
											System.out.print(j);
											System.out.print(k);
											System.out.print(l);
											System.out.print(m);
											System.out.print(n);
											System.out.print(o);
											System.out.print(p);
											System.out.print(q);
											System.out.print(r);
											
											
											return;
											}
										
									}
								}
							}
						}
					}
				}
			}
		}	
	}
}
	}

}
