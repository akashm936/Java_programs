class Employee
{
    String empid;
	String name;
	long con;
	String add;
	
	Example1(String empid,String name,long con, String add)
	{
		this.empid= empid;
		this.name = name;
		this.con= con;
		this.add = add;
	}
}

class EmpolyeeDriver
{
	public static void main(String[] args) {
		
		Employee obj = new Employee();
		System.out.println(obj);
	}
}