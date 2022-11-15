package Frankfurt.Exercise.Week3.Question_4;

public class Cat extends Animal {

    String name;
    int birth;

    public Cat() {
        super();
    }

    public Cat(String name, int birth) {
        super();
    }

    // Creates and returns a copy of this object.
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // return nearest element
    }

    // Indicates whether some other object is "equal to" this one.
    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat info = (Cat) obj;
            return info.name == this.name && info.birth == this.birth;
        } else
            return false;
    }

    // Returns a hash code value for the object.@overide
    public int hashCode() {
        return birth * 10; // hashcode
    }

    // makesound
    public static void makesound() {
        System.out.println("*Meoww");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Cat Cat1 = new Cat("Nam", 20);
        Cat cat2 = new Cat("Ha", 19);

        Animal Animal1 = Cat1;
        Animal1.makesound();
        Cat1.makesound();
        System.out.println("--------------------");

        // clone()
        System.out.println("Clone");
        Animal Animal1_copy = (Animal) Cat1.clone();
        Animal Animal2_copy = (Cat) Cat1.clone();
        Cat Cat_copy = (Cat) Cat1.clone();
        Animal1_copy.makesound();
        Animal2_copy.makesound();
        Cat_copy.makesound();
        System.out.println("--------------------");

        // check equals()
        // case1
        System.out.println("Check Animal1 equal Cat1 ?");
        if (Animal1.equals(Cat1)) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
        System.out.println();
        // case2
        System.out.println("Check Animal1 equal cat2 ?");
        if (Animal1.equals(cat2)) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
        System.out.println("--------------------");

        // Check class
        Animal.printClassName(Animal1);
        Cat.printClassName(cat2);
        System.out.println("--------------------");

        // hashCode()
        System.out.println("Hashcode Rec3?");
        System.out.println(cat2.hashCode());
        System.out.println("--------------------");

        // toString()
        System.out.println("To String Rec4?");
        System.out.println(cat2.toString());
        System.out.println("--------------------");

    }
}
