class Bank
{
    private String name;
    String branch;
    long acc_no;
    String ifsc_code;
    private String password;

    Bank(String name, String branch,long branch,String ifsc_code,String password)
    {
    	this.name=name;
    	this.branch = branch;
    	this.acc_no=acc_no;
    	this.ifsc_code=ifsc_code;
    	this.password=password;
    }	
      
    public String getname(String newname)
    {
    	System.out.println("Bank Name : " + newname);
    	return newname();
    }

    public String setpassword(String newpassword)
    {
    	name = newname;
    }

    public String getpassword(String newpassword){
    	return newpassword();
    }

    public String setpassword(String newpassword)
    {
    	password = newpassword;
    }


}
class BanakDriver
{
     Bank obj = new Bank("Kotak Bank","Nagpur",89128372637l,"NAG62323","AKM@123");
     obj.getname(obj.newname);

}