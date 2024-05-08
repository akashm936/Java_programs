class Amazon{
	
	String userName;
	String passWord;
	String location;
	long phoneNumber;
	boolean paymentOption;


	Amazon(String userName,String passWord,String location,long phoneNumber, boolean paymentOption){

        super();
		this.userName = userName;
		this.passWord = passWord;
 		this.location = location;
		this.phoneNumber = phoneNumber;
		this.paymentOption = paymentOption;
	}

	public void displayAmazon(){

		System.out.println();
		System.out.println("******* Amazon Details **********");
		System.out.println();
		System.out.println(" User Name : " +this.userName);
		System.out.println(" User passWord :"+this.passWord);
		System.out.println(" User location : "+this.location);
		System.out.println(" User phoneNumber : "+this.phoneNumber);
		System.out.println(" Support paymentOption : "+this.paymentOption);
	}
}

class AmazonPrime extends Amazon
{

	String type;
	double price;
	boolean useInternet;
	boolean dawnloadOption;
    

    AmazonPrime(String userName,String passWord,String location,long phoneNumber, boolean paymentOption,String type, double price, boolean useInternet,boolean dawnloadOption){
        
        super(userName,passWord,location,phoneNumber,paymentOption);
        this.type = type;
    	this.price = price;
    	this.useInternet = useInternet;
    	this.dawnloadOption = dawnloadOption;
    }


    public void displayAmazonPrime(){

    	System.out.println();
    	System.out.println("******** Details of Amazon Prime ******");
    	System.out.println();
    	System.out.println(" Amazon Prime is type of : "+ this.type +" Platform");
    	System.out.println(" the Price is : " + this.price + "/month");
    	System.out.println(" Internet Used(Yes/No) : " +this.useInternet);
    	System.out.println(" offline play dawnloadOption(Yes/No) : "+this.dawnloadOption);
    }
}


class AmazonDriver{

	public static void main(String[] args) {
       
       AmazonPrime obj = new AmazonPrime("Akash301","Akash123","Pune",8956122356l,true," Streaming ",125,true,true);

       obj.displayAmazon();
       obj.displayAmazonPrime();		

	}
}