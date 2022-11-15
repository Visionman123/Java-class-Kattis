package Frankfurt.Week3.Question_1;

public class RectanglePlus
        implements Relatable, Cloneable {
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public RectanglePlus() {
        origin = new Point(0, 0);
    }

    public RectanglePlus(Point p) {
        origin = p;
    }

    public RectanglePlus(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }

    public RectanglePlus(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing
    // the area of the rectangle
    public int getArea() {
        return width * height;
    }

    // a method required to implement
    // the Relatable interface
    public int isLargerThan(Relatable other) {
        RectanglePlus otherRect = (RectanglePlus) other;
        if (this.getArea() < otherRect.getArea())
            return -1;
        else if (this.getArea() > otherRect.getArea())
            return 1;
        else
            return 0;
    }

    // Creates and returns a copy of this object.
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // return nearest element
    }

    // Indicates whether some other object is "equal to" this one.
    public boolean equals(Object obj) {
        if (obj instanceof RectanglePlus) {
            RectanglePlus result = (RectanglePlus) obj;
            return result.height == this.height && result.width == this.width;
        } else
            return false;
    }

    // Returns the runtime class of an object.
    void printClassName(Object obj) {
        System.out.println("The object's" + " class is " +
            obj.getClass().getSimpleName());
    }

    // Returns a hash code value for the object.@overide
    public int hashCode() {
        return width*10+height/10; //hashcode
    }
    


    // public String toString(){}
    // // Returns a string representation of the object.
}