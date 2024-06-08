
class Array3D_Example {
	
	public static void main(String[] args) {
		int [][][] nums= {{{1,2,3,4},{6,7,8,9}},{{1,2,3,4},{6,7,8,9}}};
		
// do while
		// int i=0;
		// int k=0;
		// int j=0;
	    // do {
	    //    System.out.println(nums[i][j][k]); 
	    // }
	    // while(i<nums.length)
	    // {	
	    // 	while(j<nums[i].length) {
	    // 		while(k<nums[i][j].length)
	    // 		{
	    			
	    // 			k++;
	    // 		}
	    // 		j++;
	    // 	}
	    //     i++;
	    // }
//----------------------------------------------------------	    
		// run status : true

		//while loop
		// int i=0;
		// System.out.println("using while loop");
		// while(i<nums.length)
		// {
		// 	int j=0;
		// 	while(j<nums[i].length)
		// 	{
		// 		int k=0;
		// 		while(k<nums[i][j].length)
		// 		{
		// 			System.out.println(nums[i][j][k]);
		// 			k++;
		// 		}
		// 		System.out.println("====================");
		// 		j++;
		// 	}
		// 	i++;
		// }
//---------------------------------------------------------------
		
		
	//	for each loop

	//******** run status : true

		// for (int[][] i:nums)
		// {
		// 	for (int[] j:i)
		// 	{
		// 		for(int k:j)
		// 		{
		// 			System.out.println(k);
		// 		}
		// 		System.out.println("......");
		// 	}
		// }
		
//--------------------------------------------------------------------------
// for loop
		
		// for(int i=0;i<nums.length;i++)
		// {
		// 	for(int j=0;j<nums[i].length;j++)
		// 	{
		// 		for(int k=0;k<nums[i][j].length;k++)
		// 		{
		// 			System.out.println(nums[i][j][k]);
		// 		}
		// 		System.out.println("...........");
		// 	} 
		// }
	}
}
