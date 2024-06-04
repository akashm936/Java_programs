class Pattern103
{
	public static void main(String[] args) {
		
		int n=5;

		for(int i=1;i<=n;i++)
		{
			for(int s=n-1;s>=i;s--)
			{
				System.out.print("   ");
			}
			for (int j=1;j<=i;j++) {
				System.out.printf("%3d",(i*j));
			}
			System.out.println();
		}
	}
}