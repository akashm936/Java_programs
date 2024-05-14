// this is the example of method shadowing 

class RBI
{
	public static void rateofintrest(){
		System.out.println("RO1 : 8% + 9%");
	}
}

class SBI extends RBI
{
	public static void rateofintrest(){
		System.out.println("RO2 25 +%");
	}
}

class BankDriver
{
	public static void main(String[] args) {
		SBI obj = new SBI();
		obj.rateofintrest();
	}
}