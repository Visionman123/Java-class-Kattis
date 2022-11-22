package Frankfurt.Exercise.Week3.Question_4;

import java.util.Objects;

public class Animal {

    String name;
    int age = 0;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Animal a = new Animal();
        a.name = this.name;
        a.age = this.age;
        return a;
    }

    @Override
    public boolean equals(Object o) {
        // self check
        if (this == o)
            return true;
        // null check
        if (o == null)
            return false;
        // type check and cast
        if (getClass() != o.getClass())
            return false;
        Animal animal = (Animal) o;
        // field comparison

        return Objects.equals(this.age, animal.age) // static method without Object
                && this.name.equals(animal.name);
    }

    public String toString() {
        return "name:" + this.name + ", age:" + this.age;
    }

    public void getClassname() {
    }
}