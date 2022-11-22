package Frankfurt.Exercise.Week3.Question_4;

import java.util.Objects;

public class Cat extends Animal {

    Cat(String name, int age, String color) {
        super(name, age); // Constructor of superclass
        this.color = color;
    }

    Cat() {
    }

    String color; // We have to add to atributes to do clone and equalsmethod applicable

    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        Cat c = new Cat(this.name, this.age, this.color);
        return c;
    }

    public String getClassName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object o) {
        // self check
        if (this == o) // ten sam obiekt
            return true;
        // null check
        if (o == null)
            return false;
        // type check and cast
        if (getClass() != o.getClass())
            return false;

        if (!super.equals(o))
            return false;

        Cat catexam = (Cat) o;

        // "1".equals("1"); //comparison two object non-static object
        // Objects.equals("1", "1"); //comparison two object static
        return this.color.equals(catexam.color);

    }

    public String toString() {

        return super.toString() + ", color:" + this.color;

    }

    @Override
    public int hashCode() {
        int result = 2;
        result += 5 * age;

        return result;
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
        Animal myAnimal2 = null;

        try {
            myAnimal2 = (Animal) myAnimal.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        myAnimal2.equals(myAnimal);
        myAnimal.getClass();
        myAnimal.getClassname();
        myAnimal.hashCode();
        myAnimal.toString();

        // *********************Tests********************
        /*
         * Animal animalNew=new Animal("Zwierze", 3);
         * Animal animal2=animalNew;
         * Animal animalnull=null;
         * Animal animal3=new Animal ("Zwierze", 3);
         * 
         * 
         * System.out.println(animalNew.equals(animal2));
         * System.out.println(animalNew.equals(animalnull));
         * System.out.println(animal3.equals(animalNew));
         * 
         * Cat katze1=new Cat("Mika", 5, "braun");
         * Cat katze10=katze1;
         * Cat katze2=new Cat("Zik", 10, "white");
         * Cat katze3=new Cat("Mika", 5, "braun");
         * Cat zwierze=new Cat("Zwierze", 3, null);
         * Cat katze4=null;
         * 
         * System.out.println(katze1.equals(katze10));
         * System.out.println(katze2.equals(katze4));
         * System.out.println(katze3.equals(katze1));
         * System.out.println(katze2.equals(katze3));
         * 
         * System.out.println(zwierze.equals(animal3)); //rozne klasy dlatego -> if
         * 
         * System.out.println(katze1.toString());
         * System.out.println(katze10.toString());
         * System.out.println(katze2.toString());
         * 
         * System.out.println(animalNew);
         */
    }
}