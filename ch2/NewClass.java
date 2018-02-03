public class NewClass
{
	//client program
	public static void main(String args[])
	{
		A a = new A();
		System.out.println(a.x);//success, 3
		System.out.println(a.y);//error, client program cannot access private variable/instance.
		a.fun1();//success, 4
		a.fun2();//error, client program cannot access private method.
	}
}

class A
{
	public int x = 3;
	private int y = 4;
	public void fun1()
	{
		System.out.println(y);
	}
	private void fun2()
	{
		System.out.println(y);
	}
}