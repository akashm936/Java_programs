abstract class Parent
{
	public abstract void name(){

	}
	private abstract void surname(){

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