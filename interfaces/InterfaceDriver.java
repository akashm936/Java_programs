interface Arithmatic {
	 
	 int add(int a,int b);
	 int multi(int a, int b);
     
}
class Child extends Arithmatic{
        

     public int add(int a, int b)
     {
     	return a+b;
     }
     public int displayMultiplication()
     {
     	return a*b;
     }

}

class InterfaceDriver{

	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.displayAddition();
		obj.displayMultiplication();
	}
}