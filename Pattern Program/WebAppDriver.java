class WebApp
{
	String name;
	String technology;
	String database;
	int noofDevelopers;

	WebApp(String name,String technology, String database, int noofDevelopers)
	{
		this.name = name;
		this.technology = technology;
		this.database = database;
		this.noofDevelopers = noofDevelopers;
	}

	public void displayWebAppInfo()
	{
		System.out.println("Information about Web Application");
		System.out.println();
		System.out.println("Name : " + name);
		System.out.println("Technology : "+ technology);
		System.out.println("Database : "+database);
		System.out.println("No of Technology " + noofDevelopers);
	}

}

class WebAppDriver
{
	public static void main(String[] args) {
		WebApp obj = new WebApp("Berojgar.com","React.js","MongoDB",4);
		obj.displayWebAppInfo();
	}
}