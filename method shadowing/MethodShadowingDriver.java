class Parent
{
	public static int m1()
	{
		System.out.println("Hello from Parent");
		return 0;
	}
}
class Child extends Parent
{
	public static int m1()
	{
		System.out.println("Hello from child");
		return 0;
	}
}

class MethodShadowingDriver
{
	public static void main(String[] args) 
	{
		Child obj= new Child();
		obj.m1();
	}
}