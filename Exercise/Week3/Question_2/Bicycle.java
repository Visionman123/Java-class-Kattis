package Frankfurt.Exercise.Week3.Question_2;

public class Bicycle implements Cloneable{
        
    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;
        
    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    public void printDescription(){
        System.out.println("\nBike is " + "in gear " + this.gear
            + " with a cadence of " + this.cadence +
            " and travelling at a speed of " + this.speed + ". ");
    }

    // Creates and returns a copy of this object.
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // return nearest element
    }

    // // Indicates whether some other object is "equal to" this one.
    // public boolean equals(Object obj) {
    //     if (obj instanceof Bicycle) {
    //         Bicycle result = (Bicycle) obj;
    //         return result.height == this.height && result.width == this.width;
    //     } else
    //         return false;
    // }

    // // Returns a hash code value for the object.@overide
    // public int hashCode() {
    //     return width*10+height/10; //hashcode
    // }
}
