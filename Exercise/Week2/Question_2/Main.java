package Frankfurt.Week2.Question_2;

public class Main {
    public static void main(String[] args) {
        Bicycle Bike = new Bicycle(2, 20, 1);
        MountainBike MountBike = new MountainBike(6, 15, 3,4);

        //Bike
        System.out.println("Start cadence: " + Bike.cadence);
        System.out.println("Start speed: " + Bike.speed);
        System.out.println("Start gear: " + Bike.gear);
        System.out.println("------------------------");

        //Change of number of cadances and gears
        Bike.setCadence(1);
        Bike.setGear(7);
        System.out.println("Change of number of cadances and gears");
        System.out.println("Cadence: " + Bike.cadence);
        System.out.println("Speed: " + Bike.speed);
        System.out.println("Gear: " + Bike.gear);
        System.out.println("------------------------");

        //Slowdown
        Bike.applyBrake(5);
        System.out.println("Slowdown");
        System.out.println("Speed: " + Bike.speed);
        System.out.println("------------------------");

        //Speedup
        Bike.speedUp(15);
        System.out.println("Speed-up");
        System.out.println("Speed: " + Bike.speed);
        System.out.println("------------------------");

        //Change seat height
        MountBike.setHeight(7);
        System.out.println("Moutain's height: " + MountBike.seatHeight);



	}
    
}
