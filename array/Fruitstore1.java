import java.util.*;

class Fruitstore1
{
    String fruitname[];
    static Scanner sc = new Scanner(System.in);

    public void storeFruit(String fruitname[]){

    	this.fruitname=fruitname;
    	for(int i=0;i<fruitname.length;i++)
    	{
    		fruitname[i]=sc.next();
    	}
    } 	

    public void displayFruit()
    {
    	System.out.println(Arrays.toString(fruitname));
    }

    public void changeFruits(){

    	System.out.println("Enter a Fruits : ");
    	String inputFruits=sc.next();

    	for(int i=0; i<fruitname.length;i++)
    	{
    		if(inputFruits.equals(fruitname[i]))
    		{
    			System.out.println("Matches");

    			System.out.println("Enter a Fruits to update ");
    			String newFruits= sc.next();
    			fruitname[i]=newFruits;
    			break;
    		}
    	}
    }

    public static void main(String[] args) {
    
       

       

       Fruitstore1 ff = new Fruitstore1();
       // ff.storeFruit(fruitname);
       // ff.displayFruit();
       // ff.changeFruits();

       boolean exit=true;
       while(exit)
       {
       	System.out.println("---------------------------------");
        System.out.println();
       	System.out.println("Enter Option : ");
       	System.out.println("1. Store Fruits");
       	System.out.println("2. displayFruit");
       	System.out.println("3. change fruit");
       	System.out.println("4. Exit ");
       	System.out.println();
       	System.out.println("---------------------------------");
       	int options = sc.nextInt();
       	System.out.println("---------------------------------");

       	switch (options) {

       	    case 1:
       		{
       			System.out.print("Enter a Size of Arrays : ");
                int size = sc.nextInt();
       		    
       		   System.out.println("Enter a Fruits : ");
               String fruitname[] = new String[size];
               ff.storeFruit(fruitname);
       	    }
       	    break;
       	    case 2:
       		{
       			if(ff.fruitname==null)
       			{
       				System.out.println("Add Fruits Frist. :(  ");
       			}
       			else{
       				ff.displayFruit();
       			}

       		}
       		break;
       	    case 3:
       		{
       			if(ff.fruitname==null)
       			{
         				System.out.println("Please Add The Fruits First to make an Update");
                }
       			else{
       				ff.changeFruits();
       			}
       		}
       		break;
       	    case 4:
       	    {
       	    	exit=false;

       	    }
       	    break;
       	    default:
       		{
       			System.out.println("Invalid Options");
       		}

            }
       	}
    }
}