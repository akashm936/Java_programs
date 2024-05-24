// run Status : true

interface Parent1{
	
	default void greeting(){
	    System.out.println("Good Morning From Parent1");    
	}
}

interface Parent2{
   default void greeting(){
     	System.out.println("Good Morning form Parent2");
     }
}

interface Parent3
{
   default void displayvoid(){
   	System.out.println("This is Parent3");
   }
}

interface Child extends Parent1,Parent2,Parent3
{
   default void greeting()
   	{
   		System.out.println("Good Morning From Child");
   		Parent1.super.greeting();
   		Parent2.super.greeting();

   	}
}

class Imp implements Child{
}

class MIDriver{

	public static void main(String[] args) {
		
		Imp obj = new Imp();
		obj.greeting();
		obj.displayvoid(); 
	}
}