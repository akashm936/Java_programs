class Samsung
{
	String company_Name;
	long company_ID;
	String c_Location;
	String c_headcorter;
	

	Samsung(String company_Name,long company_ID,String c_Location,String c_headcorter){

		super();
		this.company_Name = company_Name;
		this.company_ID = company_ID;
		this.c_Location = c_Location;
		this.c_headcorter = c_headcorter;
	}

	public void displaySamsung(){

		System.out.println();
		System.out.println("****  Samsung Details ******");
		System.out.println();
		System.out.println("Company Name : "+this.company_Name);
		System.out.println("Company ID : "+this.company_ID);
		System.out.println("Company Location : "+c_Location);
		System.out.println("Company headcorter : "+this.c_headcorter);
	}
}

class SmartPhone extends Samsung
{

	double display_Size;
	String type;
	String name;
	boolean camera ;
	boolean headphonejack;


	SmartPhone(double display_Size,String type, String name,boolean camera,boolean headphonejack,String company_Name,long company_ID,String c_Location,String c_headcorter){

		super(company_Name,company_ID,c_Location,c_headcorter);
		this.display_Size = display_Size;
		this.type = type;
		this.name = name;
		this.camera = camera;
		this.headphonejack = headphonejack;

	}

	public void displaySmartPhone(){

		System.out.println();
		System.out.println("*******  SmartPhone Details *********");
		System.out.println();
		System.out.println("Size of display : "+this.display_Size);
		System.out.println("Type of SmartPhone :"+this.type);
		System.out.println("Name of SmartPhone :"+this.name);
		System.out.println("Camera Present : "+this.camera);
		System.out.println("Head Phone Jack : "+this.headphonejack);
	}
}


class S24 extends SmartPhone
{
	String modelName;
	int mfd;
	int battery;
	int storage;
	int ram;

	S24(String modelName, int mfd, int battery, int storage,int ram,double display_Size,String type, String name,boolean camera,boolean headphonejack,String company_Name,long company_ID,String c_Location,String c_headcorter){

		super(display_Size,type,name,camera,headphonejack,company_Name,company_ID,c_Location,c_headcorter);
		this.modelName=modelName;
		this.mfd=mfd;
		this.battery=battery;
		this.storage=storage;
		this.ram=ram;
	}

	public void displayS24(){

        System.out.println();
		System.out.println("*******  SmartPhone Details *********");
		System.out.println();
		System.out.println("Phone model Name: "+this.modelName);
		System.out.println("Manuf. Date : "+this.mfd);
		System.out.println("battery : "+this.battery);
		System.out.println("storage : "+this.storage);
		System.out.println("ram : "+this.ram);
	}
}


class SamsungDriver{

    S24 obj = new S24("Samsung S24 Ultra",2024,5000,256,28,6.8,"SmartPhone","S24 Ultra",true,true,"Samsung",38573845733l,"South Koria","Seoul");
    
    obj.displaySamsung();
    obj.displaySmartPhone();
    obj.displayS24();    
}