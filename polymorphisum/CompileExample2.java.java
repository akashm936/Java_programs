class Parent
{
	int a =10;

}
class Child extends Parent
{
	int a = 20;
	void m1()
	{
		System.out.println(a);
	}
}

class CompileExample2
{
	public static void main(String[] args) {
       
       Child obj = new Child();

       obj.m1();		
	}
}