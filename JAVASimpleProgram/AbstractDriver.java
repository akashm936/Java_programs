// run Status true //but its an example
abstract class Parent
{
	public abstract void name(){

	}
	private abstract void surname(){ ///illegal combination of private and abstract keyword 

	}
}

class AbstractDriver extends Parent{

	public static void main(String[] args) {
		name();
		surname();

	}

	public void name() {
		System.out.println("Akash");
	}

	public void surname(){
		System.out.println("M");
	}


}