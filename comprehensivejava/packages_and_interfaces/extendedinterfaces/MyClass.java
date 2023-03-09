package packages_and_interfaces.extendedinterfaces;

// This class must implement all of A and B
public class MyClass implements B {

    @java.lang.Override
    public void meth1() {
        System.out.println("Implement meth1().");
    }

    @java.lang.Override
    public void meth2() {
        System.out.println("Implement meth2().");
    }

    @java.lang.Override
    public void meth3() {
        System.out.println("Implement meth3().");
    }
}
