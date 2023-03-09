package packages_and_interfaces.defaultmethod;

// Implement MyIF.
public class MyIFImp implements MyIF{
    // Only getNumber() defined by MyIF needs to be implemented.
    // getString( can be allowed to default.
    @java.lang.Override
    public int getNumber() {
        return 100;
    }
}
