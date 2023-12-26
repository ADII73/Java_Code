import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
    public static void main(String[] args) {

        int YourAnswer,OpponentAnswer;
        System.out.println("--Welcome To Rock Paper Scissor Game--");
        System.out.println("0-Rock\n1-Paper\n2-Scissor");
        System.out.println("Enter your number=");
        Scanner sc=new Scanner(System.in);
        YourAnswer=sc.nextInt();
        Random rand=new Random();
        OpponentAnswer=rand.nextInt(0,2);
        System.out.println("Opponents number=");
        System.out.println(OpponentAnswer);

        if (YourAnswer==OpponentAnswer)
        {
            System.out.println("Match draw");
        }
        else if(YourAnswer==0 && OpponentAnswer==1)
        {
            System.out.println("You Win");
        }
        else if(YourAnswer==0 && OpponentAnswer==2)
        {
            System.out.println("You Win");
        }
        else if(YourAnswer==1 && OpponentAnswer==0)
        {
            System.out.println("You Lose");
        }
        else if(YourAnswer==1 && OpponentAnswer==1)
        {
            System.out.println("Match Draw");
        }else if(YourAnswer==1 && OpponentAnswer==2)
        {
            System.out.println("You Win");
        }
        else if(YourAnswer==2 && OpponentAnswer==0)
        {
            System.out.println("You Lose");
        }
        else if(YourAnswer==2 && OpponentAnswer==1)
        {
            System.out.println("You Win");
        }
        else if(YourAnswer==2 && OpponentAnswer==2)
        {
            System.out.println("Match Draw");
        }


    }
}
