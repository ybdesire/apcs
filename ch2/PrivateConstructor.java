public class PrivateConstructor
{
	//client program
	public static void main(String args[])
	{
		//A a1 = new A();//ERROR, private constructor is ok, but cannot access
		//A a2 = new A(3);//ERROR, private constructor is ok, but cannot access
	}
}

class A
{
	public static int x = 3;
	public int y;
	private A()
	{
		y=0;
	}
	private A(int m)
	{
		y=m;
	}
}