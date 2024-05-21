class Student
{
	String str1 = "Hello Akash";
	Parent()
	{
		super();
	}
	void akash(){
		System.out.println("Hello I Am Akash");
	}
	void gaurav(){
		System.out.println("Hello I am Gaurav");
	}
}


class Qspider extends Student
{
	String str1 = "Hello Qspider";
	Qspider()
	{
		super();
		System.out.println("This is Qspider Constructor");
	}

	void displayQspider(){

		System.out.println("********* Qspider Student *******");
		super.akash();
		super.gaurav();
	}
}

class AbstractionExample1
{
	public static void main(String[] args) {
		
		Qspider obj = new Qspider();
		obj.displayQspider();
	}
}