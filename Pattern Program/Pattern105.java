// Run Status : true

class Pattern105
{
	public static void main(String[] args) {
		
		int n = 4;
		int x = 1;

		for (int i = 1;i<=n;i++) 
		{
			for (int j=n;j>=1;j--) 
			{
				if(i>=j)
				{
					System.out.printf("%4d",(x*x));
					x++;
				}
				else{
					System.out.printf("   ");
				}
				
			}
			System.out.println();

			
		}
	}
}