class Pattern80
{
	public static void main(String[] args) {
		
		int n=5; //

		int k;
		for(int i=n;i>=1;i--)
		{
			k=i;
			for(int j=1;j<=i;j++)
			{
				System.out.printf("%2d",k);
				k=k+(n-j);
			}
			System.out.println();
		}
	}
}