package Inheritence.Override;

class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);

        subOb.show("This is k: "); // This calls show in B
        subOb.show(); // this calls show in A
    }
}
