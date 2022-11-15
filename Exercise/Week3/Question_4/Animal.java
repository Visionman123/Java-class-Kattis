package Frankfurt.Exercise.Week3.Question_4;

public class Animal implements Cloneable {

    public String name;
    public int birth;

    public static void makesound() {
        System.out.println("*animal_sound");
    }

    // public static void printinfo() {
    //     System.out.println("Name: " + name);
    //     System.out.println("Name: " + birth);
    // }

    // Returns the runtime class of an object.
    public static void printClassName(Object obj) {
        System.out.println("The object's" + " class is " +
                obj.getClass().getSimpleName());
    }

}
