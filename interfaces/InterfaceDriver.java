abstract class Arithmatic {
	 
	 abstract int add(int a,int b);
	 abstract int multi(int a, int b);
     
}
class Child extends Arithmatic{
        

     public int add(int a, int b)
     {
     	return a+b;
     }
     public int mul(int a,int b)
     {
     	return a*b;
     }

}

class InterfaceDriver{

	public static void main(String[] args) {
		
		// Child obj = new Child();
		System.out.println(Child.add(10,30));
	}
}