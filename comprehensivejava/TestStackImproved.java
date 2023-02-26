// This class defines an integer stack that can hold 10 values
class Stack {
    /* Now, both stack and tos are private. This means
       that they cannot be accidentally or maliciously
       altered in a way that would be harmful to the stack.
    */
    private int[] stck = new int[10];
    private int tos;

    // Initialize top-of-stack
    Stack() {
        tos = -1;
    }

    // Push an item onto the stack
    void push(int item) {
        if(tos == 9)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }

    // Pop an item from the stack
    int pop() {
        if(tos < 0){
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

class  TestStackImproved {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        // push some numbers onto the stack
        for (int i = 0; i < 10; i++) myStack1.push(i);
        for (int i = 10; i < 20; i++) myStack2.push(i);

        // pop those numbers off the stack
        System.out.println("Stack in myStack1:");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack1.pop());
        }

        System.out.println("Stack in myStack2:");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());
        }

        // these statements are not legal
        // myStack1.tos = -2;
        // myStack2.stck[3] = 100;
    }
}