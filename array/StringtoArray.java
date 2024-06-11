// run status :

import java.util.*;


class StringtoArray
{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String :");
		String sen = sc.nextLine();

		char [] arr = stringToCharArray(sen);
		System.out.println(Arrays.toString(arr));
        
        char [] arr1 = name.toCharArray();
        System.out.println(Arrays.toString(arr1));
		String word =' ';
		for(int i=0;i<sen.length();i++)
		{
			char ch = sen.charAt(i);
			if(ch==' '){
				System.out.println(i);
				System.out.println();
				break;
			}
			word += ch;
		}
		System.out.println(word);
	}
}