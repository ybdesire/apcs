public class Constructor
{
	//client program
	public static void main(String args[])
	{
		A a1 = new A();
		A a2 = new A(3);
	}
}

class A
{
	public static int x = 3;
	public int y;
	public A()
	{
		y=0;
	}
	public A(int m)
	{
		y=m;
	}
}