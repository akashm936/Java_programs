import java.util.*;
class ArraysProgram
{
	int arr[];
	static Scanner sc = new Scanner(System.in);

	public void storeElement(int arr[]){

		this.arr=arr;
		for (int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}

	}

	public void evenNumber(){
        
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(arr[i]+" is even number");
			}
		}
	}

	public void oddNumber(){

		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				System.out.println(arr[i]+" is odd number");
			}
		}
	}

	public void negativeNumber(){

		for(int i=0;i<arr.length;i++)
		{
			if(i<0)
			{
				System.out.println(arr[i]+" is negative number");
			}
		}
	}

	public void findNumber(){
            

		for(int i: arr)
		{   
			System.out.println("Enter a number");
			int userNo = sc.nextInt();
			if(i==userNo)
				System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		
		ArraysProgram ap = new ArraysProgram();

		boolean exit=true;
		while(exit)
		{
			System.out.println("---------------------------------");
			System.out.println();
			System.out.println("Select Option");
			System.out.println("1. Store Element ");
			System.out.println("2. Find Element");
			System.out.println("3. Find even Number");
			System.out.println("4. Find Odd Number");
			System.out.println("5. Fetch Negative Number");
			System.out.println("6. Exit");
			System.out.println("---------------------------------");
			int option = sc.nextInt();
			System.out.println("---------------------------------");

			switch (option) {

			case 1:
				{
					System.out.println("Enter a Array size :");
					int size = sc.nextInt();

					System.out.println("Insert Number in Arrays :");
					int arr[] = new int[size];
					ap.storeElement(arr);
			    }
			    break;

			case 2:
				{
					System.out.println("case 2");
				}
				break;
			case 3:
			    {
				    System.out.println("Case 3");

			    }
			    break;
		    case 4:
		    	{
		    		System.out.println("case 4");
		    	}
		    case 5:
		    	{
		    		System.out.println("case 5");
		    	}
		    	break;
		    case 6:
		    	{
		    		System.out.println("Thank You Program Closed!");
		    		System.out.println("---------------------------------");
		    		exit=false;
		    		
		    	}
		    	break;
		    default:
		    	{
		    		System.out.println("Invalid input");
		    		
		    	}
		    	break;

			}

		}

	}
}