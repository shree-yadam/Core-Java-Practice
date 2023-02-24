// Here Box uses a constructor to initialize the dimensions of a box.
class Box {
    double width;
    double height;
    double depth;

    // This is the constructor for Box
    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo6 {
    public static void main(String[] args) {
        // declare, allocate and initialize Box objects
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        double vol;

        // get volume of first box
        vol = myBox1.volume();
        System.out.println("Volume is " + vol);

        // get volume of second box
        vol = myBox2.volume();
        System.out.println("Volume is " + vol);
    }
}