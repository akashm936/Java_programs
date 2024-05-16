//this is the example of dawncasting

class Animal
{}

class Cat extends Animal
{
	static void method(Animal a)
	{
		if(a instanceof Cat){
			Cat c = (Cat)a; //dawnCasting
			System.out.println(" cat method in dawnCasting");
		}
	}

}

class AnimalDriverEx1
{

	public static void main(String[] args) {
		
		Animal a = new Cat();
		Cat.method(a);
	}
}
