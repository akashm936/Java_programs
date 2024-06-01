//run status : true

class Pattern48
{
	public static void main(String[] args) 
	{
		int n=5;

		int x = 1;
		int y;
		int t;


		for(int i = n;i>=1;i--)
		{
			y=i;
			t=x;

			for(int j=n;j>=i;j--)
			{
				System.out.printf("%2d",t);
				t=t-y;
				y++;
			}
			x = x+i;
			System.out.println();
		}
	}
}