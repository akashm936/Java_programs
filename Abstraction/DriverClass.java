class Parent
{
	abstract void m1();
	
	abstract  void m2();
	
	public void m3(){
		System.out.println("hello from parent m3()");
	}
    
}

class Child1 extends Parent
{
	public void m2()
	{
		System.out.println("hello from child m4()");
	}
	
	abstract void m5();
}

class Child2 extends Parent
{
	public void child2m1()
	{
		System.out.println("hello from child2 m1");
	}
	void child2m2()
	{
		System.out.println("hello from child2 m2");
	}
	void m5()
	{
		System.out.println("hello from child2 m5");
	}

}

class Subchild1 extends Child1
{

	void m1()
	{
		System.out.println("hello from sub child m1");
	}
	void m4();
}

class DriverClass
{
	public static void main(String[] args) {
		
	Child2 obj = new Child2();
	obj.child2m1();
	obj.child2m2();

	Subchild1 obj1 = new Subchild1();
    obj1.m1();
    obj1.m2();
    obj1.m3();
    obj1.m4();
	}
}