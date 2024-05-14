// this is the example of method shadowing 

class Parent
{
	public static void rateofintrest(){
		System.out.println("Engineering");
	}
}

class Child extends Parent
{
	public static void rateofintrest(){
		System.out.println("Management");
	}
}

class MOverridingex2
{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.rateofintrest();
	}
}