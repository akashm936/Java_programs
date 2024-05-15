class Parent
{
	void greeting
	{
		System.out.println("Good Morning");
	}
	void m1()
	{
		System.out.println("Hello From");
	}
}

class Child extends Parent
{
	void greeting()
	{
		System.out.println("Good Morning");
	}
	void M2()
	{
		System.out.println("HIE From the m2()");
	}

}

class DemoEx1
{
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		Child obj = new Child();
		obj.greeting();
		Parent obj = new Child();
	}
}