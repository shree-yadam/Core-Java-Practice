package packages_and_interfaces.interfacedemo;

// Another implementation of Callback.
public class AnotherClient implements Callback{

    // Implement Callback's interface
    @Override
    public void callback(int p) {
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p*p));
    }
}
