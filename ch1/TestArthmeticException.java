class TestArthmeticException
{
	public static void main(String args[])
	{
		System.out.println(0.0/0.0);//NaN
		System.out.println(100/0.0);//Infinity
		System.out.println(-1.0/0.0);//-Infinity
		System.out.println(5/0);//java.lang.ArithmeticException: / by zero
	}
}