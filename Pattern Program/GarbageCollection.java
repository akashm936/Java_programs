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
	public void finalize()
	{
		System.out.println("Object Distroed Successfully..");
	}
}

class GarbageCollection
{
	public static void main(String[] args) {
		
		MobileBox obj = new MobileBox("Yes","Yes","Yes");
		System.out.println(obj);
		System.gc();
		System.out.println(obj.siminjector);
	}
}