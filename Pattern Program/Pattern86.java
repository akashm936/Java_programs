class Pattern86
{
   public static void main(String[] args) {
   		
   		int n = 5;

   		for(int i=n;i>=1;i--)
   		{
   			for(int j=0;j<i;j++)
   			{
   				System.out.print(((i+j) % 2)+ " ");
   			}
   			System.out.println();
   		}
   	}	
}