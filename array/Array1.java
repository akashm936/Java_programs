// run status : true

class Array1
{
	public static void main(String[] args) {
		
		int [] a = {10,20,30,40};
		
       //for loop
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		//while loop
		int i= 0;
		while(i<=a.length-1)
		{
			System.out.println(a[i++]);
		} 
        
		//do while loop
		do{
			System.out.println(a[i++]);
		}
		while(i<=a.length);

	}
}