// run status : true

import java.util.*;


class StringtoArray
{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String :");
		String sen = sc.nextLine();

		char [] arr = stringToCharArray(sen);
		System.out.println(Arrays.toString(arr));
        
        char [] arr1 = sen.toCharArray();
        System.out.println(Arrays.toString(arr1));
		
	}
	public static char[] stringToCharArray(String sen)
	{
		char [] arr = new char[sen.length()];
		//A K A S H
		for(int i=0;i<sen.length();i++)
		{
			arr[i] = (sen.charAt(i));
		}
		return arr;
	}
}