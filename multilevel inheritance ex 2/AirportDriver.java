class Airport
{
	String company;
	String managerby;

	Airport(String company,String managerby){

		super();
		this.company =company;
		this.managerby=managerby;

	}

	public void displayAirport(){

		System.out.println();
		System.out.println("****** Airport details *****");
		System.out.println();
		System.out.println("company name : "+this.company);
		System.out.println("manager by : "+this.managerby);
	}
}

class Domastic extends Airport
{

	String type;
	String city;
	String manage_by;
	long capacity;

	Domastic(String type, String city, String manage_by, long capacity,String company,String managerby){

		super(company,managerby);
		this.type = type;
		this.city = city;
		this.manage_by = manage_by;
		this.capacity = capacity;

	}

	public void displayDomastic(){

		System.out.println();
		System.out.println("**** Domastic Airport details *****");
		System.out.println();
		System.out.println("type of Airport : "+this.type);
		System.out.println("city : "+this.city);
		System.out.println("manage by : "+this.manage_by);
		System.out.println("capacity : "+this.capacity);

	}
}

class International extends Airport
{
	String type2;
	String city2;
	String manage_by2;
	String capacity2;
     
    International(String type2, String city2, String manage_by2,String capacity2,String type, String city, String manage_by, long capacity,String company,String managerby){

    	super(type,city);
    	this.type2 =type2;
    	this.city2=city2;
    	this.manage_by2 = manage_by2;
    	this.capacity2 = capacity2;
    	
    }

    public void displayInternational()
    {

    	System.out.println();
    	System.out.println("****** International details *******");
    	System.out.println();
    	System.out.println("type of airport : "+this.type2);
    	System.out.println("city : "+this.city2);
    	System.out.println("manage by : "+this.manage_by2);
    	System.out.println("Capacity of Airport : "+this.capacity2);
    }
}


class AirportDriver{

	public static void main(String[] args) {
		
	Airport obj = new Airport("Adani airport","Adani");
	obj.displayAirport();

    Domastic obj1 = new Domastic("Domastic","Mumbai","Adani airport",1500000l,"Adani","adani airport");
    obj1.displayDomastic();
    International obj2 = new International("International","Dilhi","Adani Airport","20000000","International","Kolkatta","Adani group",1000000l,"Adani pvt","Adani airport");
    obj2.displayInternational();
    
	}
}
