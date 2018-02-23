abstract class MazeComponent{public abstract void area();}//only function header here
class Path extends MazeComponent{public void area(){}}//must implement the abstract function
class Wall extends MazeComponent{public void area(){}}//must implement the abstract function

public class AbstractClass
{
    public static void main(String args[])
    {
        MazeComponent p = new Path();
    }
}