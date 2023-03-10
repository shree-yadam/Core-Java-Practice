package Inheritence.Override;

// Method override
class B extends A{
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }
/*
    // display k - this overrides show() in A
    void show() {
        super.show();
        System.out.println("k: " + k);
    }*/

    // overload show()
    void show(String msg) {
        System.out.println(msg + k);
    }
}
