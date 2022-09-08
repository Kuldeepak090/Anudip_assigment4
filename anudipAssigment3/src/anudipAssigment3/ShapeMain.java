package anudipAssigment3;

interface Shape
{
    void getShape();
    void gatArea();
}

class Circle implements Shape
{
    int r = 0;
    double pi = 3.14, ar = 0;
    @Override
    public void getShape()
    {
        r = 5;
    }
    @Override
//    circle area
    public void gatArea()
    {
        ar = pi * r * r;
        System.out.println("Area of circle:"+ar);
    }
}
class Square extends Circle
{
	int s=0;
    double ar;
    public void getShape()
    {
        super.getShape();
        s=8;
    }
    public void gatArea()
    {
//    	square area
        super.gatArea();
        ar = s*s;
        System.out.println("Area of square:"+ar);
    }
}
public class ShapeMain
{
    public static void main(String[] args)
    {
        Square obj = new Square();
        obj.getShape();
        obj.gatArea();
    }
}


