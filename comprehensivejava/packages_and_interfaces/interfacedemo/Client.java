package packages_and_interfaces.interfacedemo;

public class Client implements Callback{

    // Implement Callback's interface
    @Override
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    void nonIfaceMethod() {
        System.out.println("Classes that implement interfaces " +
                "may also define other members, too.");
    }
}
