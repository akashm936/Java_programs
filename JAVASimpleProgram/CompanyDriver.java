// Run Status : true (by Gaurav And Akash)

abstract class Company
{
	Company()
   {
   	super();
   } 	
   abstract void companyName();
   abstract void companyLocation();
   abstract void noofEmpolyee();
}

abstract class Company1 extends Company
{
	String productName;
	String typeofProduct;
	Company1(String productName,String typeofProduct)
	{
		super();
		this.productName=productName;
		this.typeofProduct=typeofProduct;
	}
	void displayCompany1()
	{
		System.out.println("Product Name :  "+this.productName);
		System.out.println("Type Of Product : "+this.typeofProduct);
	}
}

class Pepsi extends Company1
{
	
	Pepsi(String productName,String typeofProduct)
	{
		super(productName,typeofProduct);
	}
		
	void companyName(){
		System.out.println("Company Name: "+ "Pepsi");
	}
	void companyLocation(){
		System.out.println("Company Location : " +"USA");
	}
	void noofEmpolyee(){
		System.out.println("Empolyee Work in : " +5000 );
	}

}

class CocaCola extends Company1{


	CocaCola(String productName,String typeofProduct)
	{
		super(productName,typeofProduct);
	}

	void companyName(){
		System.out.println("Company Name: "+ "CocaCola");
	}
	void companyLocation(){
		System.out.println("Company Location : " +"America");
	}
	void noofEmpolyee(){
		System.out.println("Empolyee Work in : " +3000 );
	}
} 
class CompanyDriver
{
	public static void main(String[] args) {
		

	Pepsi obj1 = new Pepsi("Pepsi","ColdDrink");
	System.out.println("*** product 1 ***");
	obj1.displayCompany1();
	obj1.companyName();
	obj1.companyLocation();
	obj1.noofEmpolyee();

	System.out.println();
	CocaCola obj2 = new CocaCola("CocaCola","ColdDrink");
	System.out.println("*** product 2 ***");
	obj2.displayCompany1();
	obj2.companyName();
	obj2.companyLocation();
	obj2.noofEmpolyee();
	}
}