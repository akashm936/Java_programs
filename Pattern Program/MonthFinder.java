// Run Status : True

//this is the program is used for finding the month 
//using the if else if ladder 


import java.util.*;
import java.io.*;

class MonthFinder
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	    //System.out.println("Month Finder");
	    System.out.println("Enter a Number");
	    int month = sc.nextInt();

	    if(month == 1){
	    	System.out.println(month + " = Janwary");
	    }
	    else if(month == 2)
	    {
	    	System.out.println(month + " = Febwary");
	    }
	     else if(month == 3)
	    {
	    	System.out.println(month + " = March");
	    }
	     else if(month == 4)
	    {
	    	System.out.println(month + " = April");
	    }
	     else if(month == 5)
	    {
	    	System.out.println(month + " = May");
	    }
	     else if(month == 6)
	    {
	    	System.out.println(month + " = June");
	    }
	     else if(month == 7)
	    {
	    	System.out.println(month + " = July");
	    }
	     else if(month == 8)
	    {
	    	System.out.println(month + " = Agust");
	    }
	     else if(month == 9)
	    {
	    	System.out.println(month + " = September");
	    }
	     else if(month == 10)
	    {
	    	System.out.println(month + " = Octomber");
	    }
	     else if(month == 11)
	    {
	    	System.out.println(month + "  = November");
	    }
	     else if(month == 12)
	    {
	    	System.out.println(month + " = December");
	    }
	    else {
	    	System.out.println("Invalid Month ");
	    }
	}
}