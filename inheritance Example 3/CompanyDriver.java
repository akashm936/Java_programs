class Company{
   
    String company_Name;
    boolean company_Logo;
    String company_Address;
    Long customerCare_No;	
   

   Company(String company_Name,boolean company_Logo,String company_Address,long customerCare_No){

    super();
   	this.company_Name = company_Name;
   	this.company_Logo = company_Logo;
   	this.company_Address = company_Address;
   	this.customerCare_No = customerCare_No;

   }

   public void displayCompany(){

   	System.out.println();
   	System.out.println("******* Company Details ***********");
   	System.out.println();
   	System.out.println("Company Name : " + this.company_Name);
   	System.out.println("Company Logo : " + this.company_Logo);
   	System.out.println("Company Address : " + this.company_Address);
   	System.out.println("CustomerCare No : " + this.customerCare_No);
   }
}


class Product extends Company
{

	String product_Type;
	String product_Name;
	String product_MFD;
	String product_EXP;
	long product_Id;

	Product(String company_Name,boolean company_Logo,String company_Address,long customerCare_No,String product_Type,String product_Name, String product_MFD,String product_EXP,long product_Id){

     super(company_Name,company_Logo,company_Address,customerCare_No);
     this.product_Type = product_Type;
     this.product_Name = product_Name;
     this.product_MFD = product_MFD;
     this.product_EXP = product_EXP;
     this.product_Id = product_Id;
	}

	public void displayProduct() {

		System.out.println();
		System.out.println("****** Product Details *******");
		System.out.println();
		System.out.println("Product Type : " +product_Type);
		System.out.println("Product Name : " + product_Name);
		System.out.println("Product MFD :" + product_MFD);
		System.out.println("Product EXP :" +product_EXP);
		System.out.println("Product id : "+product_Id);
	}
} 

class CompanyDriver
{
	public static void main(String[] args) {
	
	String product_Type;
	String product_Name;
	String product_MFD;
	String product_EXP;
	long product_Id;

	   Product obj = new Product("Amul",true,"Pune",9887875645457l,"Dairy Product","Amul Dudh","07-05-2024","10-05-2024",878765655457l);

	   obj.displayCompany();
	   obj.displayProduct();

	}
}