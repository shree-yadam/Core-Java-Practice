package PackagesAndInterfaces.interface_stack_demo;

// An implementation of IntStack that uses fixed storage
public class FixedStack implements IntStack {
    private int[] stck;
    private int tos;

    // allocate and intialize stack
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Push an item onto the stack
    @Override
    public void push(int item) {
        if(tos == stck.length - 1) // use length member
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }

    // Pop am item from the stack
    @Override
    public int pop() {
        if(tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else
            return stck[tos--];
    }
}
