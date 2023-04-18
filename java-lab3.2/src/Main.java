//3.2 Write a program in jAVA to demonstrate Box object of various
//dimensions using parameter to constructor.


class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

 class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 30);
        Box box2 = new Box(5, 10, 15);

        System.out.println("Volume of box1 is " + box1.volume());
        System.out.println("Volume of box2 is " + box2.volume());
    }
}
