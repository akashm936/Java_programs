// Run Status : True

class Pattern101
{
	public static void main(String[] args) {
		
		int n = 5;
		int x = 2;

		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++)
			{
				if(i<=j)
				{
					System.out.printf("%3d",x);
					x+=2;
				}
				else{
					System.out.printf("   ");//3ws
				}
			}
			System.out.println();
		}
	}
}