// this is the example of method shadowing 

class Parent
{
	public static void rateofintrest(){
		System.out.println("Good Morning");
	}
}

class Child extends Parent
{
	public static void rateofintrest(){
		System.out.println("Good Afternoon");
	}
}

class MOverridingex3
{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.rateofintrest();
	}
}