import java.util.Scanner;

class SumProd
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the Size of Array : ");
		int size =sc.nextInt();

		System.out.println("Enter the Element :" );
		int []arr = new int[size];

		int sum=0;
		int prod=1;
		//inserting element dynamically 

		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			prod=prod*arr[i];
		
		}
		System.out.println("Sum : "+sum);
		System.out.println("Product : "+prod);
	}
}