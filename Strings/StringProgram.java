import java.util.*;

class StringProgram
{
	public static void main(String[] args) {
		//find distinct characters from a String
		String str = "abhahfjancb";
		System.out.println(str);
		int [] arr = new int[str.length()];
		
		for(int i =0;i<str.length();i++)
		{
			arr[i]=str.charAt(i);
		}

		Arrays.stream(arr).distinct().forEach(ele->System.out.print((char)ele));
	}
}