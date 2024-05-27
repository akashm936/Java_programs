// Run Status : true

class Student
{
	String sName;
	String place;
	String branch;
	int yop;

	Student(String sName,String place,String branch,int yop)
	{
		this.sName = sName;
		this.place =place;
		this.branch = branch;
		this.yop = yop;
	} 

	public boolean equals(Object obj)
	{
		Student obj2 = (Student)obj;
		if((this.sName==obj2.sName)&&(this.place==obj2.place)&&(this.branch==obj2.branch)&&(this.yop==obj2.yop))
		{
			return true;
		}
		else {
			//System.out.println(this.sName + " is not match with " + obj2.sName);
			return false;
		}
	}
}
class ObjectDriver
{
	public static void main(String[] args) {
		

		Student obj1 = new Student("Akash","Jalna","CSE",2024);
		Student obj2 = new Student("Gaurav","Chh. Sambhajinagar","CSE",2024);
		System.out.println(obj1.equals(obj2));
	}

}