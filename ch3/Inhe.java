public class Inhe
{
   public static void main(String args[])
   {
      Animal a = new Animal(); 
      Dog b = new Dog();      
   }
}

class Animal
{
    private int age;
    private double weight;
}
 
class Dog extends Animal
{
    private int foot;
}


