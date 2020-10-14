package Unit1.ShapeDrawer;
import java.lang.*;

interface Shape {
    void draw();
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("I'm drawing a rectangle for you!");
    }
}

class SampleObject {

}

class Application
{
    public static void main (String[] args) throws java.lang.Exception
    {
        SampleObject obj = new SampleObject();
        Rectangle rec = new Rectangle();
        int result = obj.hashCode();
        int rectangleResult = rec.hashCode();

        System.out.println(result);
        System.out.println(rectangleResult);

        if (rec.equals(obj)) {
            System.out.println("The objects have the same hashCode");
        } else {
            System.out.println("The objects have different hashCodes");
        }
    }
}