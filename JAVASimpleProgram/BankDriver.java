class Bank
{
    private String name;
    String branch;
    //long acc_no;
    //String ifsc_code;
    private String password;

    Bank(String name,String branch, String password)
    {
    	this.name=name;
    	this.branch = branch;
    	//this.acc_no=acc_no;
    	//this.ifsc_code=ifsc_code;
    	this.password=password;
    }	
      
    public String getname()
    {
    	//System.out.println("Bank Name : " + newname);
    	return name;
    }

    public void setname(String newname)
    {
    	name = newname;
    }

    public String getpassword(){
    	return password;
    }

    public void setpassword(String newpassword)
    {
    	password = newpassword;
    }

    public void displaybank(){

    	System.out.println(name);
    	System.out.println(branch);
    	//System.out.println(acc_no);
    	//System.out.println(ifsc_code);
    	System.out.println(password);

    	//return name;
    }



}

class BankDriver
{
     public static void main(String[] args) {
     	
     	Bank obj = new Bank("Kotak Bank","Nagpur","AKM@123");
        System.out.println("Bank name is : "+obj.getname());
        System.out.println("user password : "+obj.getpassword());
        System.out.println("Branch City : "+ obj.branch);

     }

}