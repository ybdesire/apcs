public class DropBall
{
    public static double getFullLength(int k)
    {
        double length = 100;
        double sum = 100;
        for(int i=1;i<k;i++)
        {
            length/=2;
            sum+=length*2;
        }
        return sum;
    }
    
    public static void main(String[] args)
    {
        for(int i=1;i<10000;i++)
        {
            System.out.println(i + " drop, sum= " + getFullLength(i));
        }
        
    }
}