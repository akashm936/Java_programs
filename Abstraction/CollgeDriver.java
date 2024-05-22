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
	int con_no;

	Student{
		super();
		this.roll_no =roll_no;
		this
	}


}

class CollegeDriver{

	public static void main(String[] args) {
		
	}
}