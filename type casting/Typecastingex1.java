class Typecastingex1
{

	public static void main(String[] args) {
		
		byte a = 1;
		short b = a;
		int c = a;
		long d = a;
		float e = a;
		double f = a;
		//char g = a;// CTC for PLC
		//in type casting we write as
		char g = (char)a;   //type casting

		

		System.out.println(a);
	}
}