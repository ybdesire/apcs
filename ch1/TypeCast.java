class TypeCast
{
	public static void main(String args[])
	{
		int x1=3, x2;
		double y1=5.3, y2;
		y2 = x1;//success, auto cast
		x2 = (int)y1;//success, explicit cast
		x2 = y1;//error, need explicit cast
		int x = 1.75;//error, need explicit cast
	}
}