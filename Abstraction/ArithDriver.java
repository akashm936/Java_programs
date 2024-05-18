abstract class Arithmatic
{
	abstract int add(int num1,int num2);
	abstract int sub(int num1,int num2);
	abstract int mul(int num1,int num2);
	abstract int div(int num1,int num2);
}

class Operation extends Arithmatic
{
	int add(int num1,int num2)
	{
	return(num1 + num2);
    }
    int sub(int num1,int num2)
	{
	return(num1 -num2);
    }
    int mul(int num1,int num2)
	{
	return(num1 * num2);
    }
    int div(int num1,int num2)
	{
	return(num1 / num2);
    }
}

class ArithDriver
{
	public static void main(String[] args) {
		Operation obj = new Operation();
		System.out.println("the Addition of Two number (10+20) : "+obj.add(10,20));
		System.out.println("the Subtraction of Two number (10-20) : "+obj.sub(10,20));
		System.out.println("the Multiplication of Two number (10*20) : "+obj.mul(10,20));
		System.out.println("the Division of Two number (10/20) : "+obj.div(10,20));
	}
}