//Run Status : True

abstract class RBI
{
	RBI(){
		super();
	}
	abstract void rateofInterest();
	abstract void withdrowLimit();
	abstract void deposite();
}

abstract class SBI extends RBI{

	String user_name;
	String account_type;

	SBI(String user_name,String account_type)
	{
		super();

		this.user_name = user_name;
		this.account_type = account_type;
	}

	void displayDetails(){
		System.out.println("User Name : "+ user_name);
		System.out.println("account_type : "+account_type);
	}
}

class Saving extends SBI{

	Saving(String user_name,String account_type){
		super(user_name,account_type);
	}

	void rateofInterest(){
		System.out.println("Rate of interest is : " + 8.5 + "%");
		
	}
	void withdrowLimit(){
		System.out.println("withdrowLimit : "+ 50000 + "rs");
	}
	void deposite(){
		System.out.println("deposite : " + 100000 + "rs");
	}

}

class Current extends SBI{

	Current(String user_name,String account_type)
	{
		super(user_name,account_type);
	}

	void rateofInterest(){
		System.out.println("Rate of interest is : " + 7.5 + "%");
	}
	void withdrowLimit(){
		System.out.println("withdrowLimit : "+ 500000 + "rs");
	}
	void deposite(){
		System.out.println("deposite : " + 1000000 + "rs");
	}
}


class RBIDriver{
    
    public static void main(String[] args) {
    	
    System.out.println();
	Saving obj1 = new Saving("Ramesh","Saving");
	obj1.rateofInterest();
	obj1.displayDetails();
	obj1.deposite();
	obj1.withdrowLimit();

    System.out.println();
	Current obj2 = new Current("Suresh","Current");
	obj2.rateofInterest();
	obj2.displayDetails();
	obj2.deposite();
	obj2.withdrowLimit();
    }
}