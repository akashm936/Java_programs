import java.util.*;
class FindminNumber
{
	public static void main(String[] args) {
		int [] arr = {5,7,3,1,9,8};
        int j=arr[0];
	for (int i=0;i<arr.length;i++) {

	if(arr[i]<j)
	{
		j=arr[i];
	}	

	}
	System.out.println("smallest element of array is " +j);	
	}
}