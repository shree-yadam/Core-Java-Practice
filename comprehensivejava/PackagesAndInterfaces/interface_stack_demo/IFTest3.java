package PackagesAndInterfaces.interface_stack_demo;

public class IFTest3 {
    public static void main(String[] args) {
        IntStack myStack; // Create an interface reference variable
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        myStack = ds; // load dynamic stack
        // push some numebrs onto the stack
        for (int i = 0; i < 12; i++) myStack.push(i);

        myStack = fs; // load fixed stack
        for (int i = 0; i < 8; i++) myStack.push(i);

        myStack = ds;
        System.out.println("Values in dynamic stack:");
        for (int i = 0 ; i < 12; i++)
            System.out.println(myStack.pop());

        myStack = fs;
        System.out.println("Values in fixed stack:");
        for (int i = 0 ; i < 8; i++)
            System.out.println(myStack.pop());
    }
}
