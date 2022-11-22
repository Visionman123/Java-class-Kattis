package Frankfurt.Exercise.Week3.Question_2;

public class RoadBike extends Bicycle {
	// In millimeters (mm)
	private int tireWidth;

	public RoadBike(int startCadence,
			int startSpeed,
			int startGear,
			int newTireWidth) {
		super(startCadence,
				startSpeed,
				startGear);
		this.setTireWidth(newTireWidth);
	}

	public int getTireWidth() {
		return this.tireWidth;
	}

	public void setTireWidth(int newTireWidth) {
		this.tireWidth = newTireWidth;
	}

	public void printDescription() {
		super.printDescription();
		System.out.println("The RoadBike" + " has " + getTireWidth() +
				" MM tires.");
	}

	public boolean equals(Object obj) {
		RoadBike r = (RoadBike) obj;

		if (this.speed != (r.speed))
			;
		if (this.cadence != r.cadence)
			return false;
		if (this.tireWidth != r.tireWidth)
			return false;
		if (this.gear != r.gear)
			return false;

		return true;
	}

	public Object clone() {
		RoadBike rb = new RoadBike(this.cadence, this.speed, this.gear, getTireWidth());

		return rb;
	}
}
