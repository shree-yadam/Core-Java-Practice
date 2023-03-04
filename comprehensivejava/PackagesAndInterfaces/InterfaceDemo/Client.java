package PackagesAndInterfaces.InterfaceDemo;

public class Client implements Callback{

    // Implement Callback's interface
    @Override
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }
}
