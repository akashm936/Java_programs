// this is the example of method shadowing 

class Parent
{
	public static void rateofintrest(){
		System.out.println("Cloth Business");
	}
}

class Child extends Parent
{
	public static void rateofintrest(){
		System.out.println("Restorant Business");
	}
}

class MOverridingex1
{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.rateofintrest();
	}
}