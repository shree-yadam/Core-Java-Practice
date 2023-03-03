package Inheritence.example.method.override;

public class AbstractAreas {
    public static void main(String[] args) {
        //Figure f = new Figure(10, 10); // illegal now
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figRef;

        figRef = r;
        System.out.println("Area is " + figRef.area());

        figRef = t;
        System.out.println("Area is " + figRef.area());

        //figRef = f;
        //System.out.println("Area is " + figRef.area());
    }
}
