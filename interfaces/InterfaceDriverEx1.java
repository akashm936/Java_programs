interface Parent1
{
	void m1();
}
interface Parent2
{
	void m2();

interface Child extends Parent1,Parent2
{

	void m3();
}
class Driver implements Child{

	public void m1(){
        System.out.println("Hello Form m1");
	}
	public void m2(){
        System.out.println("Hello Form m2");
	}
	public void m3(){
        System.out.println("Hello Form m3");
	}
}

class InterfaceDriverEx1{

	public static void main(String[] args) {
		
		Driver.m1();
	}
}