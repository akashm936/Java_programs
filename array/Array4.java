class Array3
{
	public static void main(String[] args) {
		
		int [][][] a = {{{1,2},{3}},{{4,5,6}}};


        // System.out.println(a.length);
        // System.out.println(a[0].length);
        // System.out.println(a[0][0].length);
        // System.out.println(a[0][1].length);


		for(int [][] i:a)
		{
			for( int []j:i)
			{
				for(int k:j)
				{
					System.out.print(k+" ");
				}
			}
		}
	}
}