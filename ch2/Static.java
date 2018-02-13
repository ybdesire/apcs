public class Static
{
	//client program
	public static void main(String args[])
	{
		A.fun1();//3
		A a1 = new A();
		A a2 = new A();
		a1.x=4;
		A.fun1();//4
		a2.fun1();//4
	}
}

class A
{
	public static int x = 3;
	public int y=4;
	public static void fun1()
	{
		//System.out.println(y);//ERROR, static method cannot access non-static instance variable.
		System.out.println(x);//SUCCESS, static instance method can access static variable
	}
	public void fun2()
	{
		System.out.println(x);//SUCCESS, non-static instance method can access static variable
	}
}