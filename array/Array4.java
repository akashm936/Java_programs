class Array3
{
	public static void main(String[] args) {
		
		int [][][] a = {{{1,2},{3}},{{4,5,6}}};

		for(int [] i:a)
		{
			for( int j:i)
			{
				for(int k:j)
				{
					System.out.print(k+" ");
				}
			}
		}
	}
}