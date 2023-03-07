package packages_and_interfaces.interface_stack_demo;

public class IFTest2 {
    public static void main(String[] args) {
        DynStack myStack1 = new DynStack(5);
        DynStack myStack2 = new DynStack(8);

        // these loops cause  each stack to grow
        for (int i = 0; i < 12; i++) myStack1.push(i);
        for (int i = 0; i < 20; i++) myStack2.push(i);

        // pop those numbers of the stack
        System.out.println("Stack in myStack1:");
        for (int i = 0 ; i < 12; i++)
            System.out.println(myStack1.pop());

        System.out.println("Stack in myStack2:");
        for (int i = 0 ; i < 20; i++)
            System.out.println(myStack2.pop());
    }
}
