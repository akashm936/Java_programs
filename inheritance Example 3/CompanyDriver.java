class Company{
   
    String company_Name;
    boolean company_Logo;
    String company_Address;
    Long customerCare_No;	
   

   Company(String Company_Name,boolean Company_Logo,String Company_Address,long CustomerCare_No){

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


class 