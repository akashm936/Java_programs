import java.util.Scanner;
import java.util.Arrays;

class SortAceOrderArrays
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();

		System.out.println("Enter the element : ");
		int []arr = new int[size];

		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		// comment
		//---------------------------------------
         // int min=arr[0];

         // for(int j=0;j<arr.length;j++)
         // {
         // 	if(arr[j]!= min)
         // 	{
         // 		for(int i=0;i<arr.length;i++)
         // 		{
         // 			if(arr[i]<min)
         // 			{
         // 				min=arr[i];
         // 			}
         // 		}
         // 		System.out.println("Ascending Order :" + min );
         // 	}
         }
         
		//----------------------------------------

        //this is tracing of program
		// int temp=0;
		// for(int j=0;j<size;j++)
		// {
		// 	for(int i=0;i<size;i++)
		// 	{
		// 		if(arr[i]>arr[j])
		// 		{
		// 			temp = arr[i];
		// 			arr[i]=arr[j];
		// 			arr[j]=temp;
		// 		}
		// 	}
		// 	System.out.println(Arrays.toString(arr));
		// }
	}
}

//pelendrom
//vowel count
// dublicate element

// write a java program to fetch second smallest element in the array
//write a java program to second largest element in the array
// write a java porgram to sort element in acending  order