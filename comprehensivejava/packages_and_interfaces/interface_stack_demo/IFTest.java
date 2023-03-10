package packages_and_interfaces.interface_stack_demo;

public class IFTest {
    public static void main(String[] args) {
        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);

        // push some numbers onto the stack
        for (int i = 0; i < 5; i++) myStack1.push(i);
        for (int i = 0; i < 8; i++) myStack2.push(i);

        // pop those numbers of the stack
        System.out.println("Stack in myStack1:");
        for (int i = 0 ; i < 5; i++)
            System.out.println(myStack1.pop());

        System.out.println("Stack in myStack2:");
        for (int i = 0 ; i < 8; i++)
            System.out.println(myStack2.pop());
    }
}
