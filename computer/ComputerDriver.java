class Computer
{
     String brand;
     double resolution;
     int size;
     double price;
     Cpu cpu;
     Keyboard keyboard;
     Speaker speaker;


     Computer(String brand,double resolution,int size,double price){

     	this.brand=brand;
        this.resolution=resolution;
        this.size=size;
        this.price=price;
    }


    public void displayComputer(){

        System.out.println();
    	System.out.println("****  Computer Details ******");
        System.out.println();
        System.out.println("brand of computer : "+ this.brand);
        System.out.println("resolution of computer : "+this.resolution);
        System.out.println("size of computer : " +this.size);
        System.out.println("price of computer :" + this.price);
    	
    } 
    public void createInstanceofCpu(String brand,String socketType, String memorySupport,int turboSpeed){

        cpu = new Cpu(brand,socketType,memorySupport,turboSpeed);
    }

    public void createInstanceofKeyboard(String brand,String type, String keys, double price){

        keyboard = new Keyboard(brand,type,keys,price);
    }

    public void createInstanceofSpeaker(String brand, int watt,String rating,String type){

        speaker = new Speaker(brand,watt,rating,type);

    }


}

class Cpu{

	String brand;
    String socketType;
    String memorySupport;
    int turboSpeed;


    Cpu(String brand, String socketType,String memorySupport,int turboSpeed){

    	this.brand=brand;
        this.socketType=socketType;
        this.memorySupport=memorySupport;
        this.turboSpeed=turboSpeed;
    	
    }


     public void displayCpu(){

        System.out.println();
    	System.out.println("****  Cpu Details ******");

        System.out.println();
    	System.out.println(" brand name : " + this.brand);
        System.out.println("CPU socketType : "+ this.socketType);
        System.out.println("memorySupportin CPU : "+ this.memorySupport);
        System.out.println("CPU turboSpeed : "+this.turboSpeed);
    	
    }


   
}


class Keyboard{

	String brand;
    String type;
    String keys;
    double price;
    // Speaker speaker;
    

	Keyboard(String brand,String type,String keys,double price){

		this.brand=brand;
        this.type=type;
        this.keys=keys;
        this.price=price;
   
	}


	 public void displayKeyboard(){
        

    	System.out.println();
        System.out.println("****  Keyboard Details ******");
        System.out.println();
    	System.out.println(" Brand name : " + this.brand);
    	System.out.println(" type of keyboard : "+ this.type);
    	System.out.println(" No  key of Keys : " + this.keys);
    	System.out.println(" price of keyboard : " + this.price);
      	
    }

   
}



class Speaker{

	String brand;
	int watt;
	String rating;
	String type;
	

	Speaker(String brand,int watt,String rating,String type){


		this.brand=brand;
        this.watt=watt;
        this.rating=rating;
        this.type=type;
	}


	 public void displaySpeaker(){
          
        System.out.println();
    	System.out.println("****  Speaker Details ******");
        System.out.println();
    	System.out.println("  Brand Name : " + this.brand);
    	System.out.println(" Watt support Speaker : "+ this.watt);
    	System.out.println(" Rating of Speaker : " + this.rating);
    	System.out.println(" Type of Speaker : " + this.type);
    	
    }
}


class ComputerDriver{


	public static void main(String[] args) {
		
		Computer obj = new Computer("DELL",1250,15,25000);
        obj.displayComputer();
        obj.createInstanceofCpu("DELL","C-type","512",64);
        obj.cpu.displayCpu();
        obj.createInstanceofKeyboard("Zebronics","wireless","99",1500);
        obj.keyboard.displayKeyboard();
        obj.createInstanceofSpeaker("JBL",22,"5 Star","wireless");
        obj.speaker.displaySpeaker();


	}
}