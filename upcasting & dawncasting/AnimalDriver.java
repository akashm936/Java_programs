class Animal
{

}

class Dog1 extends Animal
{
	void m1(){
		System.out.println("Dog 1 from ");
	}
}

class AnimalDriver{

	public static void main(String[] args) {
		
		Dog1 d = new Dog1();
		System.out.println(d instanceof Animal);
		d.m1();
	}
}