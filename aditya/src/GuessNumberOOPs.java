import java.util.Scanner;
import java.util.Random;
class game{
    public int number;
    public int inputNumber;
    public int numberOfGueses;

    public int getNumberOfGueses() {
        return numberOfGueses;
    }

    public void setNumberOfGueses(int numberOfGueses) {
        this.numberOfGueses = numberOfGueses;
    }

    void game(){
        Random rand = new Random();
        this.number = rand.nextInt(0,10);
    }
    void UserInputNumber(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber =sc.nextInt();


    }
    boolean isCorrectNumber(){
        if(inputNumber==number){

            return true;
        }
        else if (inputNumber<number) {
            System.out.println("Too low...");
        }
        else if (inputNumber>number) {
            System.out.println("Too high...");
        }
        return false;
    }
}
public class GuessNumberOOPs {
    public static void main(String[] args) {
        game g= new game();
        boolean b =false;
        while (!b){

        g.UserInputNumber();
         b = g.isCorrectNumber();
        System.out.println();
        }

    }
}
