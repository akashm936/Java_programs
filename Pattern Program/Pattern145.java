class Pattern145
{
	public static void main(String[] args) {
		
		int n = 5;
		int z = 1;
		int i;
		int j;
		int k;

		for(i=n;i>=1;i--)
		{
			for(j=1;j<i;j++){
				System.out.print("  ");
			}
			for(k=0;k<z;k++)
			{
				System.out.print((k+j)+" ");
			}
			z+=2;
			System.out.println();
		}
	}
}