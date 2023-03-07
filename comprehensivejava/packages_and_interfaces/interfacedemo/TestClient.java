package packages_and_interfaces.interfacedemo;

public class TestClient {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
