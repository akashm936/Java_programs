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

	void displayPepsiDetails(){

		System.out.println("product Name : " + productName);
		System.out.println("Type of product : " + typeofProduct);
	}
} 
class CompanyDriver
{
	Pepsi obj1 = new Pepsi("")
}