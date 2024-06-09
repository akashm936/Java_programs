class Array1D
{
	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50,60,45};

		// for(int i=0;i<arr.length;i++)
		// {
		// 	System.out.println(arr[i]);
		// }

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

		for (int i :arr ) {
			System.out.println(i);
			i++;
			
		}
	}
}