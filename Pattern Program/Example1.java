import java.util.*;
class Student
{
	String name;
	String place;
	String branch;
	Student(String name,String place, String branch)
	{
		this.name = name;
		this.place = place;
		this.branch = branch;
	}
	@Override
	public String toString()
	{
		return "Hi my name " + this.name + " and I Belongs to "+ this.place + " I completed " + this.branch + " Engineering"
	}
}

class Example1
{
	public static void main(String[] args) {
		Student obj1 = new Student("Akash","Jalna","Computer");
		System.out.println(obj1);
	}
}