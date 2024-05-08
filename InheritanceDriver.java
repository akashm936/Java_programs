class Parent
{
	String str1 = "Hi from parent class ";
	void m1(){
	
	System.out.println("Hi from Parent class m1()");

	}

	static void m3(){
		System.out.println("hi from the m3 method static parent ");
	}
}


class Child extends Parent{

	String str2 = " Hello from Child Class";
	void m2(){

		System.out.println("Hi from child m2()");

	}
	static void m4(){
		System.out.println("hi from the static m4() child") ;
	}
}


class inheritanceDriver{


	public static void main(String[] args) {
		
		Child  obj = new Child();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}
}