// run status : true

class Array1D
{
	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50,60,45};
		char [][] name = {{'A','K','A','S','H'},{'M','O','R','W','A','L'}};

//for loop
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		for(int i=0;i<name.length;i++)
		{
			System.out.print(name[i]+" ");
			for(int j=0;j<name.length;j++)
			{
				System.out.print(name[i][j]);
			}
			
		}
		

//do while loop
        // int i=0;
		// do{
		// 	System.out.println(arr[i]);
		// }
		// while(i<arr.length);
        
// while loop
		// int i=0;
		// while(i<arr.length)
		// {
		// 	System.out.println(arr[i]);
        //     i++;

		// }

// for each loop
		// for (int i :arr ) {
		// 	System.out.println(i);
		// 	i++;
			
		// }
	}
}