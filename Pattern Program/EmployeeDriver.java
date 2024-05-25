// run status : true

class Employee
{
    String empid;
	String name;
	long con;
	String add;
	
	Employee(String empid,String name,long con, String add)
	{
		this.empid= empid;
		this.name = name;
		this.con= con;
		this.add = add;
	}
	@Override
	protected void finalize(){
		System.out.println();
		System.out.println("************ Object Destroid successfully ****************");
		System.out.println();
	}
}

class EmployeeDriver
{
	public static void main(String[] args) {
		
		Employee obj = new Employee("E001","Akash",767346374l,"Jalna");
		System.out.println(obj);
		//obj.finalize();
		obj=null;
		System.gc();
		System.out.println(obj.name);


	}
}