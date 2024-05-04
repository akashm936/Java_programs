class ProgrammingLanguages
{
	String type;
	String level;
	int inventedYear;
	String foundername;
	double latestVersion;
	String extention;


	ProgrammingLanguages(String type, String level,int inventedYear,String foundername,double latestVersion,String extention)
	{
		super();
		this.type=type;
		this.level=level;
		this.inventedYear=inventedYear;
		this.foundername=foundername;
		this.latestVersion=latestVersion;
		this.extention=extention;
	}

	public void displayProgramminglanguage()
	{
		System.out.println();
		System.out.println("****** ProgrammingLanguages ********");
		System.out.println("Type : " + this.type);
		System.out.println("level : "+ this.level);
		System.out.println("inventedYear : "+ this.inventedYear);
		System.out.println("latestVersion : " +this.latestVersion);
		System.out.println("extention : "+ this.extention);

	}
}


class Java extends ProgrammingLanguages
{
	String [] features;
	boolean platformIndependent;

    Java(String [] features, boolean platformIndependent,String type, String level,int inventedYear,String foundername,double latestVersion,String extention)
    {
    	super(type,level,inventedYear,foundername,latestVersion,extention);
    	this.features = features;
    	this.platformIndependent = platformIndependent;
    }

    public void displayJava(){
         
        System.out.println();
    	System.out.println("***** Java *******");
    	System.out.println("It is platform Independent");
    	System.out.println("features of Java :");
    }
}

class SingleLevelDriver
{
    public static void main(String[] args) {
    		

    		String [] features = {"1. Multithered","2. Secure and Rebust","3. Portable","4. Dynamic"};
    		Java obj = new Java(features,true,"Object Oriented","High level",1991,"James Gosling",1.22,".java");
    		obj.displayProgramminglanguage();
    		obj.displayJava();
    	}	
}