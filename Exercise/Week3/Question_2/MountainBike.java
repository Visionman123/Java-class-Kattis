package Frankfurt.Exercise.Week3.Question_2;

public class MountainBike extends Bicycle {
    private String suspension;

    public MountainBike(
            int startCadence,
            int startSpeed,
            int startGear,
            String suspensionType) {
        super(startCadence,
                startSpeed,
                startGear);
        this.setSuspension(suspensionType);
    }

    public String getSuspension() {
        return this.suspension;
    }

    public void setSuspension(String suspensionType) {
        this.suspension = suspensionType;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The " + "MountainBike has a " +
                getSuspension() + " suspension.");
    }

    public boolean equals(Object obj) {
        MountainBike b = (MountainBike) obj;

        if (this.speed != (b.speed))
            ;
        if (this.cadence != b.cadence)
            return false;
        if (!(this.suspension.equals(b.getSuspension())))
            return false;
        if (this.gear != b.gear)
            return false;

        return true;
    }

    void printClassName(Object obj) {
        System.out.println("The Bicycle Class is " + obj.getClass().getSimpleName());

    }

    void printMethods(Object obj) {
        System.out.println("The methods of the Bicycle  are" + obj.getClass().getMethods());
    }

    @Override
    public int hashCode() {
        int result = 4;
        result = 32 * result + cadence;
        result = 32 * result + gear;
        result = 32 * result + speed;
        return result;
    }

    @Override
    public String toString() {
        String output = ("The cadence:" + this.cadence + ", The speed:" + this.speed + ", The gear:" + this.gear
                + ", The suspension: " + this.suspension);
        return output;
    }

    public Object clone() {
        MountainBike mb = (MountainBike) super.clone();
        mb.suspension = this.suspension;
        return mb;
    }
}