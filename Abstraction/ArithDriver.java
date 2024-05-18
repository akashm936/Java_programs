class Arithmatic
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
		System.out.println(obj.add(10,20));
		System.out.println(obj.sub(10,20));
		System.out.println(obj.mul(10,20));
		System.out.println(obj.div(10,20));
	}
}