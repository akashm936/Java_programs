import java.util.*;
//this is the program for convert charactor to convert to the integer

class CharTOInt
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Alphabet : ");
		char al = sc.next().charAt(0);
        int num = 1;
        

		for(char i='A';i<='Z';i++)
		{
			// count++;
			int op=num++;
   		    if(al==i)
		    {
		    	System.out.println(al + " = " + op);
		    }
		}

	}
}