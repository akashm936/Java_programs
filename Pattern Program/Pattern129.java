
class Pattern129
{
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			for(int k=9;k>=i;k--)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) {
				System.out.print(i+ " ");	
			}
			System.out.print("\n");
		}
	}
}