
class Parent
{
	void greeting()
	{
		System.out.println("Good Morning");
	}
	void m1()
	{
		System.out.println("Hello From m1()");
	}
}

class Child extends Parent
{
	void greeting()
	{
		System.out.println("Good Afternoon");
	}

	void m2()
	{
		System.out.println("HieFrom m2()");
	}
}

class Demo
{
	public static void main(String [] args)
	{
		System.out.println("Hello World");
	}
	Child obj = new Child();
	obj.greeting();
	//Parent obj = new Child();
	     //  obj = (Child)m2();

	//Child obj2 = (Child)obj;
	  //    o = m2();
}