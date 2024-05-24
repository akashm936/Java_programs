// run status : true
class NoPattern
{

	public static void main(String[] args) {
		
		int n=5;
		int x=2;

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.println("%2d",x);
				x+=2;
			}
			System.out.println();
		}
	}
	
}