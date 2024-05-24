// run status : true

abstract class Parent1
{
	
	abstract void greeting();
}
class Parent2 extends Parent1
{
   void greeting()
   {
   	System.out.println("Good Afternoon");
   }
}

class NewParent{

	public static void main(String[] args) {
		
		Parent2 obj = new Parent2();
		obj.greeting();
	}

}