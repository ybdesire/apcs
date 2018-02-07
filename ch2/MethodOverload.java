public class MethodOverload
{
	//client program
	public static void main(String args[])
	{
		A a = new A();
		a.fun(5);
		a.fun(5.0);
		a.fun(4.0,3);
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
	// method overload by diff para/types
	// not by return type
	public void fun(int m)
	{
		System.out.println("this is fun-int");
	}
	public void fun(double m)
	{
		System.out.println("this is fun-double");
	}
	public void fun(double m, int n)
	{
		System.out.println("this is fun-double-int");
	}
}