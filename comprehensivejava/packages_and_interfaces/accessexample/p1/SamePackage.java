package packages_and_interfaces.accessexample.p1;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("n = " + p.n);

        // class only
        // System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " +p.n_pub);
    }
}
