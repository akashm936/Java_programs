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

interface Child extends Parent1,Parent2
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

class MultipleInheritanceDriver{

	public static void main(String[] args) {
		
		Imp obj = new Imp();
		obj.greeting(); 
	}
}