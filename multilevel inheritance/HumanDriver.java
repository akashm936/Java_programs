//this is java code of multilevele inheritance
//github : akash936

class Human{

    String name;
    String gender;

    Human(String name,String gender){

    	super();
    	this.name = name;
    	this.gender = gender;

    }

    void eat(){
    	System.out.println("Human Can eat.");
    }
    void walk(){
    	System.out.println("Human Can walk.");
    }	
    void think(){
    	System.out.println("Human Can think.");
    }
    void speak(){
    	System.out.println("Human Can speak.");
    }

    public void displayHuman(){
    	System.out.println();
    	System.out.println("********** Human details *******");
    	System.out.println();
    	System.out.println("Name of Human : "+ this.name);
    	System.out.println("Gender : "+ this.gender);
    }



}

class Graduation extends Human{

    String course;
    int duration;
    String branch;
    String univercity;
    int yop;

    Graduation(String course,int duration,String branch,String univercity,int yop,String name,String gender){

    	super(name,gender);
    	this.course = course;
    	this.duration = duration;
    	this.branch = branch;
    	this.univercity = univercity;
    	this.yop = yop;


    }

    

    public void displayGraduation(){
    	System.out.println();

    	System.out.println("********* Graduation details ***********");
    	System.out.println();
    	System.out.println("Name of course: "+ this.course);
    	System.out.println("duration : "+ this.duration);
    	System.out.println("branch : "+ this.branch);
    	System.out.println("univercity : "+ this.univercity);
    	System.out.println("Year of Passout : "+ this.yop);
    }


}




class PostGraduation extends Graduation{

    String spetialist;
    int durationpg;
    int yoppg;
    String univercitypg;


    PostGraduation(String spetialist,int durationpg,int yoppg,String univercitypg,String course,int duration,String branch,String univercity,int yop,String name,String gender){

    	super(course,duration,branch,univercity,yop,name,gender);
    	this.spetialist = spetialist;
    	this.durationpg = durationpg;
    	this.yoppg = yoppg;
    	this.univercitypg = univercitypg;


    }
 
    public void displayPostGraduation(){

    	System.out.println();
    	System.out.println("******* Post Graduation *********");
    	System.out.println();
    	System.out.println("Name of spetialist : "+ this.spetialist);
    	System.out.println("duration : "+ this.durationpg);
    	System.out.println("Year of Passout : "+ this.yoppg);
    	System.out.println("univercity : "+ this.univercitypg);

    }


}

class Job extends PostGraduation
{
	String company;
    int salary;
    String designation;
    String location;


    Job(String company,int salary,String designation,String location,String spetialist,int durationpg,int yoppg,String univercitypg,String course,int duration,String branch,String univercity,int yop,String name,String gender){

        super(spetialist,durationpg,yoppg,univercitypg,course,duration,branch,univercity,yop,name,gender);
        this.company = company;
    	this.salary = salary;
    	this.designation = designation;
    	this.location =location;
    }


    public void displayJob(){

    	System.out.println();
    	System.out.println("***** Job details ******");
    	System.out.println();
    	System.out.println("Name of company : "+ this.company);
    	System.out.println("salary : "+ this.salary + " lanks");
    	System.out.println("designation : "+ this.designation);
    	System.out.println("location : "+ this.location);

    }

}


class HumanDriver{

	public static void main(String[] args) {
                                                                                                                                                            
		Job obj = new Job("Tech Mahindra",9,"Sr. Software Engineer","Pune","Cyper Security",2,2024,"Dbatu","Bechalers of technology",4,"Computer Science","DBatu",2024,"Akash","Male");
		
		obj.eat();
		obj.walk();
		obj.think();
		obj.speak();
		obj.displayHuman();
		obj.displayGraduation();
		obj.displayPostGraduation();
		obj.displayJob();
	}
}