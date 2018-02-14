public class This
{
	//client program
	public static void main(String args[])
	{
		A a = new A(5);//print 5
	}
}

class A
{
	private int x;
	public A(int x)
	{
		this.x = x;
		System.out.println(this.x);
	}
}