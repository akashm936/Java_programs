//herachical inheritance

class Google 
{
    String c_name;
    int yearofF;
    String c_CEO;
    String nsdq_name;

    Google(String c_name,int yearofF,String c_CEO,String nsdq_name){

    	this.c_name = c_name;
    	this.yearofF = yearofF;
    	this.c_CEO = c_CEO;
    	this.nsdq_name = nsdq_name;
    }

    public void displayGoogle(){

    	System.out.println();
    	System.out.println("***** Google details ******");
    	System.out.println();
    	System.out.println("company Name : " +this.c_name);
    	System.out.println("Year of Found : "+this.yearofF);
    	System.out.println("company CEO : "+this.c_CEO);
    	System.out.println("Nasdaq Name : "+this.nsdq_name);
    }
}

class GoogleMap extends Google
{
	String appname ;
	String p_company;
	String realeasedate;
	String lastupdate;

	GoogleMap(String appname,String p_company,String realeasedate,String lastupdate,String c_name,int yearofF,String c_CEO,String nsdq_name){
        
        super(c_name,yearofF,c_CEO,nsdq_name);
		this.appname = appname;
		this.p_company =p_company;
		this.realeasedate = realeasedate;
		this.lastupdate = lastupdate;

	}

	public void displayGoogleMap(){
		System.out.println();
		System.out.println("***** Google Map Details *******");
		System.out.println();
		System.out.println("App Name : " +this.appname);
		System.out.println("parent company : " +this.p_company);
		System.out.println(" realeasedate: " +this.realeasedate);
		System.out.println("lastupdate: " +this.lastupdate);
	}

}

class GooglePay extends Google
{
	String appname ;
	String p_company;
	String realeasedate;
	String lastupdate;
	String type;

	GooglePay(String appname,String p_company,String realeasedate,String lastupdate, String type,String c_name,int yearofF,String c_CEO,String nsdq_name){

		super(c_name,yearofF,c_CEO,nsdq_name);
		this.appname = appname;
		this.p_company =p_company;
		this.realeasedate = realeasedate;
		this.lastupdate = lastupdate;
		this.type = type;

	}

	public void displayGooglePay(){
		System.out.println();
		System.out.println("***** Google Pay Details *******");
		System.out.println();
		System.out.println("App Name : " +this.appname);
		System.out.println("parent company : "+this.p_company);
		System.out.println(" realeasedate: " +this.realeasedate);
		System.out.println("lastupdate: " +this.lastupdate);
		System.out.println(" Type of App : " +this.type);
	}

}

class GoogleDriver{

	public static void main(String[] args) {
		

		Google obj2 = new Google("Google",1995,"Sunder Pichai","Google");
		obj2.displayGoogle();
		GoogleMap obj = new GoogleMap("Google Map","Google","28-july-2008","5-may-2024","Google",1995,"Sunder Pichayi","Google");
		obj.displayGoogleMap();
		GooglePay obj1 = new GooglePay("GooglePay","Google","29-Nav-2017","7-may-2024","Payment App","Google",1995,"Sunder Pichayi","Google");
	    obj1.displayGooglePay();

	}
}