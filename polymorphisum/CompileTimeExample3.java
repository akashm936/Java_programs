//this is program of the veriable shadowing and we are 
// used the super class and this keyowrd is used to view the ouput of shodowing veriable

class Parent{
	
	int a =10;

}
class Child extends Parent
{

	int a =20;
	void m1()
	{
		int a =30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

class CompileTimeExample3{
	public static void main(String[] args) {
		///this is remaining
		Child obj = new Child();

		obj.m1();
	}
}