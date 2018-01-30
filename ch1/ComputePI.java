public class ComputePI
{
     public static void main(String []args)
     {
        double sum = 0.0;
        int maxDenominator = 10000000;
        for (int denominator = 1; denominator <= maxDenominator; denominator += 2) 
        {  // 1, 3, 5, 7,...
           if (denominator % 4 == 1) 
           {
              sum += 1.0/denominator;
           } else if (denominator % 4 == 3) 
           {
              sum -= 1.0/denominator;
           } else 
           {   // remainder of 0 or 2
              System.out.println("The computer has gone crazy?!");
           }
        }
        System.out.println(4*sum);
     }
}


