class Parent
{
	public static void Merrige1()
	{
		System.out.println("Sushila");
	}
}

class Chaild extends Parent
{
	public static void Merrige1()
	{
		System.out.println("Shila...");
	}
}


class Merrige
{
	public static void main(String[] args)
	{
		Chaild obj = new Chaild();
		obj.Merrige1();
	}

}