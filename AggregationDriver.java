class Univercity
{
     String name;
     String unicode;
     int noofcolleges;
     String type;
     int establishedyear;
     int course;
     College college;

     Univercity(String name,String unicode,int noofcolleges,String type,int establishedyear,int course){

     	this.name=name;
     	this.unicode=unicode;
     	this.noofcolleges=noofcolleges;
     	this.type=type;
     	this.establishedyear=establishedyear;
     	this.course=course;
    }


    public void displayUnivercity(){

        System.out.println();
    	System.out.println("****  Univercity Details ******");
        System.out.println();
    	System.out.println("Univercity name : " + this.name);
    	System.out.println(" Univercity code : "+ this.unicode);
    	System.out.println(" Colleges are attached with Univercity : " + this.noofcolleges);
    	System.out.println(" type of Univercity : " + this.type);
    	System.out.println(" establishedyear : " + this.establishedyear);
    	System.out.println(" course is : "+ this.course);
    }

    public void createInstanceofcollege(String name,String collegecode,String address,int noofdepart,String grade,int staffcount){

        college = new College(name,collegecode,address,noofdepart,grade,staffcount);
    }


}

class College{

	String name;
    String collegecode;
    String address;
    int noofdepart;
    String grade;
    int staffcount;
    Department department;

    College(String name, String collegecode, String address, int noofcolleges,String grade, int staffcount){

    	this.name=name;
    	this.collegecode=collegecode;
    	this.address=address;
    	this.noofdepart=noofdepart;
    	this.grade=grade;
    	this.staffcount=staffcount;
        
    }


     public void displayCollege(){

        System.out.println();
    	System.out.println("****  College Details ******");

        System.out.println();
    	System.out.println(" College name : " + this.name);
    	System.out.println(" College code : "+ this.collegecode);
    	System.out.println(" College address: " + this.address);
    	System.out.println(" no of Department : " + this.noofdepart);
    	System.out.println(" College grade : " + this.grade);
    	System.out.println(" no of staff: "+ this.staffcount);
    }


    public void createInstanceofDepartment(String name, String hod, int classrooms,int staff,int subject){

        department = new Department(name,hod,classrooms,staff,subject);
    }
}


class Department{

	String name;
	String hod;
	int classrooms;
	int staff;
	int subject;
    Teacher teacher;

	Department(String name,String hod,int classrooms,int staff,int subject){

		this.name=name;
		this.hod=hod;
		this.classrooms=classrooms;
		this.staff=staff;
		this.subject=subject;
   
	}


	 public void displayDepartment(){
        

    	System.out.println();
        System.out.println("****  Department Details ******");
        System.out.println();
    	System.out.println(" Department name : " + this.name);
    	System.out.println(" HOD name : "+ this.hod);
    	System.out.println(" No of classrooms in Department : " + this.classrooms);
    	System.out.println(" no of staff : " + this.staff);
    	System.out.println(" no of subject : " + this.subject);
    	
    }

    public void createInstanceofTeacher(String name,String subject,long phonenumber,String qualification,int exp){

        teacher = new Teacher(name,subject,phonenumber,qualification,exp);

    }
}



class Teacher{

	String name;
	String subject;
	long phonenumber;
	String qualification;
	int exp;


	Teacher(String name,String subject,long phonenumber,String qualification,int exp){


		this.name=name;
		this.subject=subject;
		this.phonenumber=phonenumber;
		this.qualification=qualification;
		this.exp=exp;
	}


	 public void displayTeacher(){
          
        System.out.println();
    	System.out.println("****  Teacher Details ******");
        System.out.println();
    	System.out.println(" Teacher name : " + this.name);
    	System.out.println(" Teacher subject : "+ this.subject);
    	System.out.println(" phone number : " + this.phonenumber);
    	System.out.println(" qualification : " + this.qualification);
    	System.out.println(" experience : " + this.exp);
    	
    }
}


class AggregationDriver{


	public static void main(String[] args) {
		
		Univercity obj = new Univercity("DBatu","DBATU123",25,"private",2000,100);
        obj.displayUnivercity();
        obj.createInstanceofcollege("MSSCET","MSS2138","Jalna",5,"A++",100);
        obj.college.displayCollege();
        obj.college.createInstanceofDepartment("CSE","G. Chakote",3,6,40);
        obj.college.department.displayDepartment();
        obj.college.department.createInstanceofTeacher("Prof. Shubhangi","Cryptography",9342394743l,"M.ech",3);
        obj.college.department.teacher.displayTeacher();

	}
}