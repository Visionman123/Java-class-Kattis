package Frankfurt.Week3.Question_1;

public class RectanglePlusDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        Point p1 = new Point(1, 1);

        RectanglePlus Rec1 = new RectanglePlus();
        RectanglePlus Rec2 = new RectanglePlus(p1);
        RectanglePlus Rec3 = new RectanglePlus(3, 2);
        RectanglePlus Rec4 = new RectanglePlus(p1, 2, 3);

        // clone()
        System.out.println("Create Rec3_copy = Rec3 ?");
        RectanglePlus Rec3_copy = (RectanglePlus)Rec3.clone();
        System.out.println("Rec3 copy = (" + Rec3_copy.width + "," + Rec3.height + ")");
        System.out.println("--------------------");
        

        // equals()
        // case1
        System.out.println("Check Rec2 equal Rec3 ?");
        if (Rec2.equals(Rec3)) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
        System.out.println();
        // case2
        System.out.println("Check Rec3 equal Rec3_copy ?");
        if (Rec3.equals(Rec3_copy)) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
        System.out.println("--------------------");

        // getclass()
        System.out.println("Check Rec1 class?");
        Rec1.printClassName(Rec1);
        System.out.println("--------------------");

        // hashCode()
        System.out.println("Hashcode Rec3?");
        System.out.println(Rec3.hashCode());
        System.out.println("--------------------");

        // toString()
        System.out.println("To String Rec4?");
        System.out.println(Rec4.toString());
        System.out.println("--------------------");

    }
}
