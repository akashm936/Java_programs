//Run Status : true

class Parent
{
	String str = "Hello Parent";
	Parent()
	{
		super();
		System.out.println("Hello From Parent Constructor");
	}
	void m1()
	{
		System.out.println("m1() Parent");
	}
	void m2()
	{
		System.out.println("m2() Parent");
	}
}

class Child extends Parent
{
	String str = "Hello Child";
	Child()
	{
		super();
		System.out.println("Hello Form Child Constructor");
	}

	void m3()
	{
		System.out.println(str);
		System.out.println(super.str);
		System.out.println("m1");
		super.m1();
		super.m2();

	}
}

class AbstractionExample
{
	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.m3();
	}
}