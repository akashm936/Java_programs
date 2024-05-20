abstract class RBI
{
	RBI(){
		super();
	}
	abstract void rateofInterest();
	abstract void withdrowLimit();
	abstract void DepositeLimit();
}

abstract class SBI extends RBI{

	String user_name;
	String account_type;

	SBI(String user_name,String account_type)
	{
		super(user_name,account_type);

		this.user_name = user_name;
		this.account_type = account_type;
	}

	void displayDetails(){
		System.out.println("User Name : "+ user_name);
		System.out.println("account_type : "+account_type);
	}
}

class Saving extends SBI{

	void rateofInterest(){
		System.out.println("Rate of interest is : " + 8.5 + "%");
		
	}
	void withdrowLimit(){
		System.out.println("withdrowLimit : "+ 50000 + "rs");
	}
	void DepositeLimit(){
		System.out.println("DepositeLimit : " + 100000 + "rs");
	}

}

class Current extends SBI{

	void rateofInterest(){
		System.out.println("Rate of interest is : " + 7.5 + "%");
	}
	void withdrowLimit(){
		System.out.println("withdrowLimit : "+ 500000 + "rs");
	}
	void DepositeLimit(){
		System.out.println("DepositeLimit : " + 1000000 + "rs");
	}
}


class RBIDriver{

	Saving obj1 = new Saving("Ramesh","Saving");
	obj1.rateofInterest();
	obj1.displayDetails();
	obj1.DepositeLimit();
	obj1.withdrowLimit();

	Current obj2 = new Current("Suresh","Current");
	obj2.rateofInterest();
	obj2.displayDetails();
	obj2.DepositeLimit();
	obj2.withdrowLimit();
}