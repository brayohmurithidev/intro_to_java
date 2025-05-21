/*
- classes are blueprints of an object
- Objects are an instance of classes
- public, private, protected are some of the available access modifiers.
- public are accessed anywhere.
- protected are accessed in only the package classes and the subclasses
- private are only accessed within the class they are declared
- We use Getters and Setters to update or read from private attributes and methods.
 */

public class Object_Classes {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.speaks();
    }


    public static class Person {
        int age;
        String name;
        String eyeColor;
        String gender;

        void speaks() {
            System.out.println("French");
        }
    }
}
