//this is example of method overloading in polymorphisum

class Ramesh{

public static void main(String[] args) {
		
		System.out.println("BYEE");
	}
	Ramesh(){
		System.out.println("Hello");
	}
	public static void main(int a){

		System.out.println("M1()");
	}
}

class Suresh extends Ramesh
{
	Suresh()
	{
		System.out.println("Hello From Suresh");
	}
	void Ramesh(int a){
		System.out.println("hello");
	}

}