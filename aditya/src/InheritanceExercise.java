class animal{
    int sound;
    int figure;
    int color;

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        System.out.println("Dog barks");
        this.sound = sound;
    }

    public int getFigure() {
        return figure;
    }

    public void setFigure(int figure) {
        System.out.println("Dogs body is small");
        this.figure = figure;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        System.out.println("Dogs color vary");
        this.color = color;
    }
}
class dog extends animal{
    int tail;
    int breed;

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        System.out.println("The tail is long");
        this.tail = tail;
    }

    public int getBreed() {
        return breed;
    }

    public void setBreed(int breed) {
        System.out.println("Breed may vary");
        this.breed = breed;
    }
}
public class InheritanceExercise {
    public static void main(String[] args) {
        animal an=new animal();
        an.setSound(4);
        System.out.println(an.getSound());
        an.setColor(5);
        System.out.println(an.getColor());

        dog b=new dog();
        b.setFigure(5);
        System.out.println(b.getFigure());

        dog d=new dog();
        d.setBreed(4);
        System.out.println(d.getBreed());


    }
}
