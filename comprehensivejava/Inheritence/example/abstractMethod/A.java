package Inheritence.example.abstractMethod;

// A simple demonstration of abstract.
abstract public class A {
    abstract void callMe();

    // concrete methods are still allowed in abstract classes
    void callMeToo() {
        System.out.println("This is a concrete method.");
    }
}
