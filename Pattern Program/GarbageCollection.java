// run status : true

import java.util.*;

class MobileBox
{
	String siminjector ;
	String cover;
	String charger;

	MobileBox(String siminjector, String cover,String charger)
	{
		this.siminjector = siminjector;
		this.cover = cover;
		this.charger = charger;
	}
	@Override
	public void finalize()    //we dont need to call finalize method 
	// the System.gc() class call automatically to finalize method when they find un used mememry
	{
		System.out.println("Object Distroed Successfully..");
	}
}

class GarbageCollection
{
	public static void main(String[] args) {
		
		MobileBox obj = new MobileBox("Yes","Yes","Yes");
		System.out.println(obj);
		obj=null;   //for delete all the value
		System.gc();  //this is for garbage collection 
		System.out.println(obj.siminjector);
	}
}