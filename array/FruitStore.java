import java.util.*;
// create switch statement in this program
class FruitStore
{
   String fruits[];
   static Scanner sc = new Scanner(System.in);

   public void storeFruit(String fruits[])
   {
   	this.fruits=fruits;
   	for(int i=0;i<fruits.length;i++)
   	{
   		fruits[i]=sc.next();
   	}
   }

   public void displayFruits()
   {
   	System.out.println(Arrays.toString(fruits));
   }

   public void chnageFruit()
   {
   	System.out.println("Enter a Fruit: ");
   	String inputFruit = sc.next();

   	for(int i=0; i<fruits.length;i++)
   	{
   		if(inputFruit.equals(fruits[i]))
   		{
   			System.out.println("Matches");

   			System.out.println("Enter a fruits to update");
   			String newFruit=sc.next();
   			fruits[i]=newFruit;
   			break;
   		}
   	}
   }

   public static void main(String[] args) {
   	
   	System.out.println("Enter a Size of Arrays");
   	int size =sc.nextInt();

   	System.out.println("Enter a fruits: ");
   	String fruits[] = new String[size];

   	FruitStore f =new FruitStore();
   	f.storeFruit(fruits);
   	f.displayFruits();
   	f.chnageFruit();

   }
}