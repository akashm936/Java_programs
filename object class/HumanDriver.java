// run Status : True


class Human implements Cloneable{
	
	String name;
	String place;
	String gender;
	String proffesion;

	Human(String name, String place,String gender,String proffesion)
	{
		this.name =name;
		this.place = place;
		this.gender = gender;
		this.proffesion = proffesion;
	}
	
	public String toString()
	{
		return this.name +" "+ this.place+" " + this.gender+" " + this.proffesion;
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}

class HumanDriver{

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		
		Human obj1 = new Human("Akash","Jalna","Male","SDE");
		System.out.println(obj1);

		Human obj2 = (Human)obj1.clone();
		System.out.println(obj2);

		obj2.name = "Gaurav";
		obj2.place ="Chh. sambhajinagar";
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
//name ,place , gender proffesion