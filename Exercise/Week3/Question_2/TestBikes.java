package Frankfurt.Week3.Question_2;

public class TestBikes {
  public static void main(String[] args) throws CloneNotSupportedException{
    Bicycle bike01, bike02, bike03;

    bike01 = new Bicycle(20, 10, 1);
    bike02 = new MountainBike(20, 10, 5, "Dual");
    bike03 = new RoadBike(40, 20, 8, 23);

    // Bike
    bike01.printDescription();
    bike02.printDescription(); // mountain bike
    bike03.printDescription(); // road bike

    // clone()
    System.out.println("\n--------------------");
    System.out.println("Create copy of Bike 1?");
    Bicycle bike01_copy = (Bicycle) bike01.clone();
    bike01_copy.printDescription();


  }
}
