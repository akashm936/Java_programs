abstract class Company
{
   public abstract void companyName();
   public abstract void companyLocation();
   public abstract void noofEmpolyee();

   Company()
   {
   	super();
   } 	

}

abstract class Pepsi extends Company
{
	String productName;
	String typeofProduct;

	Pepsi(String productName,String typeofProduct)
	{
		super(productName,typeofProduct);
		this.productName = productName;
		this.typeofProduct = typeofProduct;
	}

	// void displayPepsiDetails(){

	// 	System.out.println("product Name : " + productName);
	// 	System.out.println("Type of product : " + typeofProduct);
	// }
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

class CocaCola extends Company{

	String productName;
	String typeofProduct;

	Pepsi(String productName,String typeofProduct)
	{
		super(productName,typeofProduct);
		this.productName = productName;
		this.typeofProduct = typeofProduct;
	}

	// void displayPepsiDetails(){

	// 	System.out.println("product Name : " + productName);
	// 	System.out.println("Type of product : " + typeofProduct);
	// }

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
	Pepsi obj1 = new Pepsi("Pepsi","ColdDrink");
	obj1.companyName();
	obj1.productName();
	obj1.companyLocation();
	obj1.noofEmpolyee();
	obj1.typeofProduct();

	
}