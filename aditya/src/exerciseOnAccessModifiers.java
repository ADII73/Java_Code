class cylinder{
   private int radius;
   private int height;

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
        return 2*Math.PI*radius*radius + 2*3.14*radius*height;
    }
}
public class exerciseOnAccessModifiers {
    public static void main(String[] args) {
        cylinder mycylinder= new cylinder();
        mycylinder.setHeight(12);
        mycylinder.setRadius(9);
        System.out.println(mycylinder.getHeight());
        System.out.println(mycylinder.getRadius());
        System.out.println(mycylinder.surfacearea());

    }
}
