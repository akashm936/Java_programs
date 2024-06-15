// run status : true 


import java.util.Scanner;

class CountNo
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a size ");
		int size=sc.nextInt();

		System.out.println("Enter element of array : ");
		int [] arr = new int[size];

		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Number you want to get the count?");
		int num=sc.nextInt();

		int count =0;

		for(int i=0;i<size;i++)
		{
			if(arr[i]==num)
			{
				count++;
			}
		}
		System.out.println("count of Number is : :"+ count);
	}
}




