// run status : true

import java.util.*;

class ForeachArray
{
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8};

		int count=0;
		for (int i : arr) {
			if(i%2==0)
				count++;
			//else
				//count++;
		}

		int [] evenNumbers = new int[count];
		int [] oddNumbers  = new int[count];
		int indx = 0;
		for (int i :arr)
		{
			if(i%2==0)
				evenNumbers[indx++]=i;
			else
			oddNumbers[indx]=i;

		}
		System.out.println("The Even Number is "+Arrays.toString(evenNumbers));
		System.out.println("The odd Number is "+Arrays.toString(oddNumbers));
        
	}
}