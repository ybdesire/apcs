interface MazeComponent{public abstract void area();}//only function header here
class Path implements MazeComponent{public void area(){}}//must implement the abstract function
class Wall implements MazeComponent{public void area(){}}//must implement the abstract function

public class InterfaceDemo
{
    public static void main(String args[])
    {
        MazeComponent p = new Path();
        MazeComponent w = new Wall();
    }
}