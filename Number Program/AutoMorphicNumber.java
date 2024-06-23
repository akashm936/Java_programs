// run status : true

import java.util.Scanner;

class AutoMorphicNumber
{
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
        
        //System.out.println(" To check AutoMorphicNumber ");
		//System.out.println("Enter a Numebr : ");
        //int num = sc.nextInt();

		int num= 76; //predefind value
		int dup=num;
		int sqr=num*num;
		int div =1;

		while(num!=0)
		{
			div*=10;
			num/=10;
		}
		int id=sqr%div;
		//5667%100 = 76

		System.out.println((dup==id)?"AutoMorphicNumber":"Not a AutoMorphicNumber");
	}
}