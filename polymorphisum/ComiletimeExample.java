//this is the example of veriable shadowing in compile time polymorphisum

class ComiletimeExample
{
   int a =20;  // this is the veriable shadowing example 
   public static void main(String[] args) {
   		
   		ComiletimeExample obj = new ComiletimeExample();
   		obj.m1();
   	}	
   	public void m1()
   	{
   		int a= 200;  //this local veriable is shaodowing the global veriable 
   		System.out.println(a);
   	}
}