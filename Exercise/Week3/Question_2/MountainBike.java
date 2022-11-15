package Frankfurt.Week3.Question_2;

public class MountainBike extends Bicycle {
    private String suspension;

    public MountainBike(
               int startCadence,
               int startSpeed,
               int startGear,
               String suspensionType){
        super(startCadence,
              startSpeed,
              startGear);
        this.setSuspension(suspensionType);
    }

    public String getSuspension(){
      return this.suspension;
    }

    public void setSuspension(String suspensionType) {
        this.suspension = suspensionType;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The " + "MountainBike has a" +
            getSuspension() + " suspension.");
    }

    // Creates and returns a copy of this object.
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // return nearest element
    }

    // Indicates whether some other object is "equal to" this one.
    public boolean equals(Object obj) { // Startbike
        if (obj instanceof MountainBike) {
            MountainBike result = (MountainBike) obj;
            return result.speed == this.speed;
        } else
            return false;
    }

    // Returns a hash code value for the object.@overide
    public int hashCode() {
        return speed*10; //hashcode
    }
} 
