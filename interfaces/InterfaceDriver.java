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
	}
}