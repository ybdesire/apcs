class Student{}
class GradStudent extends Student{}
class UnderGrad extends Student{}

public class ClassCastException
{
    public static void main(String args[])
    {
        Student u = new Student();
        System.out.println( (GradStudent)u);
    }
}