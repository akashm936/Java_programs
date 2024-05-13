//this is the example of the method shadowing in compile time polymorphisum


class Ramesh
{
	public static void greeting(){ //this is shodowing method 
		System.out.println( "Good Morning!!"); 
	}
}

class Suresh  extends Ramesh
{
	public static void greeting()
	{
		System.out.println("Good Afternoon");
	}
}

class CompileTimeEx4{

	public static void main(String[] args) {
		
		Suresh obj = new Suresh();

		obj.greeting();
	}
}