//Run Status : True


//this is example of wildining

class Type_conversion
{
	public static void main(String[] args) {
		
		char a=10;`
		byte x=a;
		short b=a;
		int c=a;
		long d=a;
		float e=a;
		double f=a;

		char g=a;
		System.out.println(a);
   
      //type casting rule  of wilding
 	     //byte =   all except char
		 //int    = all except  ,byte, char, short
		 //short = byte except  char
		 //long = int except  short,byte,char 
         //float =  except double 
         //double = not convert with any type 
         //char = all except byte short
        
	}
}