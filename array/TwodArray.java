import java.util.Scanner;

class TwodArray
{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the row Size: ");
		
		int rows = sc.nextInt();
		System.out.println("Enter the Size of cols : ");
		
		int cols = sc.nextInt();

		System.out.println("Enter the Element of Array : ");
		int [][]arr = new int[rows][cols];

		for(int i=0;i<rows;i++)
		{
			for(int j=0;i<cols;i++)
			{
				arr[i][j]=sc.nextInt();
			}
			//to store even and odd element in two diffrent array
			
		}

		for(int i=0;i<rows;i++)
		{
			for(int j=0;i<cols;i++)
			{
				System.out.print(arr[i][j]+" ");

			}
			System.out.println();
		}


	}
}