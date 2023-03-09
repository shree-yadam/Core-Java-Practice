package packages_and_interfaces.extendedinterfaces;

// one interface can extend another
// B now includes meth1() and meth2() -- it adds meth3()
public interface B extends A{
    void meth3();
}
