package PackagesAndInterfaces.InterfaceDemo;

public class TestClient {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
