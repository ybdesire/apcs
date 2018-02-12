public class Scope
{
	//client program
	public static void main(String args[])
	{
		{//code block
			int x = 3;
		}
		//System.out.println(x);//ERROR, x cannot be accessed
		
		
		for(int x=0;x<5;x++)
		{//code block
		}
		//System.out.println(x);//ERROR, x cannot be accessed
	}
}
