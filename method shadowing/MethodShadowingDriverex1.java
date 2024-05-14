// some issue solove it later
class Parent
{
	public static Object m1()
	{
		
		System.out.println("Hello from Parent");
		
	}
}
class Child extends Parent
{
	public static String m1()
	{
		
		System.out.println("Hello from child");
	
		
	}
}

class MethodShadowingDriverex1
{
	public static void main(String[] args) 
	{
		Child obj= new Child();
		obj.m1();
	}
}