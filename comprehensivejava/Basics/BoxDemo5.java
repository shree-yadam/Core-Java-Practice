// Now, volume() returns the volume of a box.

class Box {
    double width;
    double height;
    double depth;

    // compute and return volume
    double volume() {
        return width * height * depth;
    }

    // sets dimensions of box
    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}

class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        // initialize each box
        myBox1.setDim(10,20,15);
        myBox2.setDim(3, 6, 9);

        // get volume of first box
        vol = myBox1.volume();
        System.out.println("Volume is " + vol);

        // get volume of second box
        vol = myBox2.volume();
        System.out.println("Volume is " + vol);
    }
}