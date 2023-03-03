package Inheritence.example.method.override;

public class Triangle extends Figure{
    Triangle(double a, double b) {
        super(a, b);
    }

    // override area for Right Triangle
    double area() {
        System.out.println("Inside area for Triangle.");
        return dim1 * dim2 / 2;
    }
}
