package Frankfurt.Exercise.Week3.Question_2;

public class TestBikes {
  public static void main(String[] args){
    Bicycle bike001, bike002, bike003;

    bike001 = new Bicycle(30, 15, 1);   //Bicycle
    bike002 = new MountainBike(20, 10, 4, "Dual");
    bike003 = new RoadBike(30, 20, 2, 32);

    bike001.printDescription();
    bike002.printDescription();
    bike003.printDescription();
    
    System.out.println(bike001.equals(bike002));
    System.out.println(bike001.getClass());
    System.out.println(bike001.hashCode());
    System.out.println(bike001.toString());
    
    Bicycle bike005=(Bicycle) bike001.clone();				//why no catch/try block???
    

/*    RoadBike bike011=(RoadBike) bike003.clone();
    
    bike001.printDescription();
    bike002.printDescription();
    bike003.printDescription();
    bike005.printDescription();
    bike011.printDescription();
    */
    System.out.println(bike001 instanceof Bicycle);
    System.out.println(bike001 instanceof MountainBike);
  }
}