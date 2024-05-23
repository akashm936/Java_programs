// Run status : True


//this is the interface
interface Arithmatic
{
	 
	  int add(int a,int b);
	  int multi(int a, int b);
     
}
class Child implements Arithmatic{
        

     public int add(int a, int b)
     {
     	return a+b;
     }
     public int multi(int a,int b)
     {
     	return a*b;
     }

}

class InterfaceDriver{

	public static void main(String[] args) {
		
		Child obj = new Child();
		System.out.println("Addition of 10,30 : "+obj.add(10,30));
	     System.out.println("Multiplication of 10,30 : "+obj.multi(10,30));
	}
}