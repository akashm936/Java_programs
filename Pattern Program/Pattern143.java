// run status : true

class Pattern143
{
	public static void main(String[] args) {
		
		int n=5;
		int z=1;

		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=z;k>=1;k--)
			{
				System.out.print(" " + k);
			}
			z+=2;
			System.out.println();
		}
	}
}