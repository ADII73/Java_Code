class Mycylinder{

    private int radius;
    private int height;

    public Mycylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfacearea(){
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }
}
public class Constructor_Exercise {
    public static void main(String[] args) {
        Mycylinder ok = new Mycylinder(9,12);

//        ok.setHeight(12);
        System.out.println(ok.getHeight());
//        ok.setRadius(9);
        System.out.println(ok.getRadius());

        System.out.println(ok.surfacearea());





    }
}
