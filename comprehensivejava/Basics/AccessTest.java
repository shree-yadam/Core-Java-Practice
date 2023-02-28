/* This program demonstrates the difference between
public and private.
 */
class Test {
    int a; // default access
    public int b; // public  access
    private int c; // private access

    // methods to access c
    void setC(int c) { // set c's value
        this.c = c;
    }

    public int getC() { // get c's value
        return c;
    }
}
public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();

        // These are OK, a and b may be accessed directly
        ob.a = 10;
        ob.b = 20;

        // This is not OK and will cause an error
    //  ob.c = 100;

        // You must access c through its methods
        ob.setC(100); // OK
        System.out.println("a, b, and c: " + ob.a + " " +
                ob.b + " " + ob.getC());
    }
}
