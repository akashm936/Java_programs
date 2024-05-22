// Run Status : True

class Collge {
	
	String collge_Name;
    String address;
    String collge_Type;
    String principle_name;

    Collge(String collge_Name,String address,String collge_Type,String principle_name)
    {
    	super();
    	this.collge_Name = collge_Name;
    	this.address = address;
    	this.collge_Type = collge_Type;
    	this.principle_name = principle_name;
    }

    void displayCollege()
    {
    	System.out.println("******* Collge Details ********");
    	System.out.println();
    	System.out.println("Collge Name : " +collge_Name);
    	System.out.println("Collge Address : "+address);
    	System.out.println("Collge Type : "+collge_Type);
    	System.out.println("Name Of Principle "+principle_name);

    }

}
class Student extends Collge
{
	int roll_no;
	String student_Name;
	String stud_address;
	long con_no;

	Student(String collge_Name, String address, String collge_Type, String principle_name){
		super(collge_Name,address,collge_Type,principle_name);
		this.roll_no =roll_no;
		this.student_Name=student_Name;
		this.stud_address = stud_address;
		this.con_no = con_no;
	}

	Student(String collge_Name, String address, String collge_Type)
	{
		super(collge_Name,address,collge_Type);
		this.roll_no = roll_no;
		this.student_Name = student_Name;
		this.stud_address = stud_address;
		this.con_no = con_no;

		System.out.println(" Student Constructor is overload");
	}

	void displayStudent(){

		System.out.println("******** Student Details ************");
		System.out.println();
		System.out.println("Roll No : "+roll_no);
		System.out.println("Student Name : "+student_Name);
		System.out.println("Student Address : "+stud_address);
		System.out.println("Student Contact No : "+con_no);
	}
}

class CollegeDriver{

	public static void main(String[] args) {
	

	Student obj = new Student("MSS-CET","JALNA","ENGINEERING");

    obj.displayCollege();
    obj.displayStudent();

	}
}