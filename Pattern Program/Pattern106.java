// Run Status : True

class Pattern106
{
	public static void main(String[] args) {
		
		int n = 5;
		int k = 1;

		for(int i = 1; i<=n;i++)
		{
			for(int j = n;j>=1;j--)
			{
				if(i>=j)
				{
					System.out.printf("%3d",k++);
				}
				else{
					System.out.print("   "); //
				}
			}
			System.out.println();
		}
	}
}