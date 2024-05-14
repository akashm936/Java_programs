// this is the example of method shadowing 

class Parent
{
	public static Object rateofintrest(){
		return null;
	}
}

class Child extends Parent
{
	public static String rateofintrest(){
	    return null;	
	}
}

class MOverridingex4
{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.rateofintrest();
	}
}