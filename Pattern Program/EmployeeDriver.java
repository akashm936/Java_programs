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
	public void finalize(){
		System.out.println("object Destroid successfully");
	}
}

class EmpolyeeDriver
{
	public static void main(String[] args) {
		
		Employee obj = new Employee("E001","Akash",767346374l,"Jalna");
		System.out.println(obj);
		obj.finalize();
		System.out.println(obj.name);


	}
}