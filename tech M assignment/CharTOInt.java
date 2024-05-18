//run true
import java.util.*;
//this is the program for convert charactor to convert to the integer

class CharTOInt
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        

        //logic for A = 1
		// System.out.print("Enter Alphabet : ");
		// char al = sc.next().charAt(0);
        // int num = 1;
        

		// for(char i='A';i<='Z';i++)
		// {
		// 	// count++;
		// 	int op=num++;
   		//     if(al==i)
		//     {
		//     	System.out.println(al + " = " + op);
		//     }
		// }

         //this is the logic for the AA= 27 etc
		System.out.print("Enter a Character : ");
		String str = sc.next().toUpperCase();
		int op = 0;

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(i==0){
		        op = (ch-64);
			}
		    else{
			   op = (op*26)+(ch-64);
		    }
			
			System.out.println(str + " = " + op);
		}

	}
}

//