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

class Domastic extends Airport{

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

class International extends Airport{

	String type;
	String city;
	String manage_by;
	String capacity;
     
    International(String type, String city, String manage_by,String capacity,String type, String city, String manage_by, long capacity,String company,String managerby){

    	super(type,city,manage_by,capacity,company,managerby);
    	this.type =type;
    	this.city=city;
    	this.manage_by = manage_by;
    	this.capacity = capacity;
    	
    }

    public void displayInternational(){

    	System.out.println();
    	System.out.println("****** International details *******");
    	System.out.println();
    	System.out.println("type of airport : "+this.type);
    	System.out.println("city : "+this.city);
    	System.out.println("manage by : "+this.manage_by);
    	System.out.println("Capacity of Airport : "+this.capacity);
    }
}


class AirportDriver{

	Airport obj = new Airport("Adani airport","Adani");
	obj.displayAirport();
    Domastic obj1 = new Domastic("Domastic","Mumbai","Adani",1500000l,"Domastic","Mumbai","Adani","Mumbai",14000000l,"Adani","adani");
    obj1.displayDomastic();
    International obj1 = new International("International","Mumbai","Adani",1500000l,"International","Mumbai","Adani","Mumbai",14000000l,"Adani","adani");
    obj1.displayInternational();
    
}