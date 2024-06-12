import java.util.Scanner;
import java.util.Arrays;

class NewArray
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array Size: ");
		int size=sc.nextInt();
		System.out.println("Enter Array Element: ");
		int []arr= new int[size];

		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int evenCount=0;
		int oddCount=0;


		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				evenCount++;
			}
			else{
				oddCount++;
			}
		}
		//new Question wajp  to merge two arrays into one single arrays //

		int evenArray[] = new int[evenCount];
		int oddArray[] = new int[oddCount];

		int itt1=0;
		int itt2=0;

		for(int j=0;j<size;j++)
		{
			if(arr[j]%2==0)
			{
				evenArray[itt1++]=arr[j];
			}
			else
			{
				oddArray[itt2++]=arr[j];
			}
		}
		System.out.println("even Array : "+ Arrays.toString(evenArray));
		System.out.println("Odd Array : "+ Arrays.toString(oddArray));
	}
}