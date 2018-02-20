class Animal
{
   public void move()
   {
      System.out.println("animal can move");
   }
   public void step1()
   {
       System.out.println("animal move-1");
   }
   public void step2()
   {
       System.out.println("animal move-2");
   }
}
 
class Dog extends Animal
{
   public void move()
   {
      System.out.println("dog can run and move");
   }
   public void step1()
   {
       System.out.println("dog move-1");
   }
   public void step2()
   {
       super.step1();
       System.out.println("dog move-2");
   }
}

public class PartialOverriding
{
   public static void main(String args[])
   {
      Animal a = new Animal(); 
      Dog b = new Dog();
      a.step2();
      b.step2();
   }
}

