package MidPractise;

public class Box {
    double height, width, depth;

    Box(double h, double w, double d) {
        this.height = h;
        this.width = w;
        this.depth = d;
    }

    double displayVol() {
        return height * depth * width;
    }

    public static void main(String[] args) {

        Box B1 = new Box(10, 10, 10);
        double vol = B1.displayVol();
        System.out.println("Volume of B1=" + vol);
        Box B2 = new Box(20, 30, 10);
        double vol1 = B2.displayVol();
        System.out.println("Volume of B1=" + vol1);
    }
}
