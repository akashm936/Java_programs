// MULTI LEVEL INHERITANCE

// 10-05-2024

class ITCompany{
	
	String name;
	String location;

	ITCompany(String name, String location){

		super();
		this.name =name;
		this.location = location;
	}

	public void displayITCompany(){

		System.out.println();
		System.out.println("****** IT Company Information ********");
		System.out.println();
		System.out.println("Name Of Comapny : "+this.name);
		System.out.println("Company Location : "+this.location);
	}
}

class TechMahindra extends ITCompany
{
	String noofEmpolyee;
	double valueation;
	String address;
	boolean hiring;

	TechMahindra(String noofEmpolyee,double valueation,String address, boolean hiring,String name, String location){

		super(name,location)
		this.noofEmpolyee = noofEmpolyee;
		this.valueation = valueation;
		this.address = address;
		this.hiring = hiring;
	} 

	public void displayTechMahindra(){

		System.out.println();
		System.out.println("*********  Tech Mahindra details *******");
		System.out.println();
		System.out.println("No of Empolyee : " +this.noofEmpolyee);
		System.out.println("Company valueation : "+this.valueation);
		System.out.println("Company address : "+this.address);
		System.out.println("hiring Status : "+this.hiring);
	}
}

class TCS extends ITCompany
{
	String tcs_emp;
	double tcs_val;
	String tcs_add;
	String tcs_hiring;
   
    TCS(String tcs_emp,double tcs_val,String tcs_add,String tcs_hiring){

    	this.tcs_emp = tcs_emp;
    	this.tcs_val = tcs_val;
    	this.tcs_add = tcs_add;
    	this.tcs_hiring  =tcs_hiring;
    }

    public void displayTCS(){

    	System.out.println();
    	System.out.println("******* TCS details ********");
    	System.out.println();
    	System.out.println("No of Empolyee : "+this.tcs_emp);
    	System.out.println("Company valueation : "+this.tcs_val);
    	System.out.println("Company address : "+this.tcs_add);
    	System.out.println("hiring Status : "+this.tcs_hiring);
    }
}

class ITCompanyDriver
{
	public static void main(String[] args) {
	

		ITCompany obj = new ITCompany("TechMahindra","Pune");
		obj.displayITCompany();
	}
}