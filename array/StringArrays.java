// run Status :

import java.util.Scanner;
import java.util.Arrays;

class StringArrays
{
    static Scanner sc = new Scanner(System.in); 
    public void userdetails(){

    	System.out.println("Enter Your first Name :");
    	String name=sc.nextLine();

    	System.out.println("Enter Your Middle Name :");
    	String mname= sc.nextLine();

    	System.out.println("Enter Your Last Name :");
    	String lname = sc.nextLine();

    	String []userdetails = new String[name];

    	for (int i=0;i<userdetails.length;i++) {

    		String userdetails[i]= sc.nextLine();
    	 } 


    }

	public static void main(String[] args) {
		
		System.out.println("Good Evening");
        
        StringArrays n = new StringArrays();		
        n.userdetails();
	}
}