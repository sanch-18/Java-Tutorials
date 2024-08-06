import java.util.Random;
import java.util.Scanner;

class Game{
    private int score;
    private int number;
    private int chosen_number;
    private Random rand;
    private Scanner sc;
    private boolean gameover;

    public Game()
    {
        this.score = 0;
        this.rand = new Random();
        this.number = rand.nextInt(100)+1;
        this.gameover = false;
    }
    private void userInput()
    {
        System.out.print("Choose your number : ");
        sc = new Scanner(System.in);
        this.chosen_number = sc.nextInt();
    }
    private void numberCheck()
    {
        if(number<chosen_number) {
            System.out.println("Please enter a lower number");
            score++;
        }
        else if(number>chosen_number)
        {
            System.out.println("Please enter a higher number");
            score++;
        }
        else
        {
            System.out.println("Congratualations you have guessed the correct number\nYour Score is "+score);
            gameover = true;
        }
    }
    public void looping() {
        while (!gameover) {
            userInput();
            numberCheck();
        }
    }
}
public class GuessTheNumber {
    public static void main(String[] args) {
        boolean play=true;
        Scanner sc = new Scanner(System.in);
        while(play) {
            Game a = new Game();
            a.looping();
            System.out.print("Game Over!\nDo you want to play again (Choose true/false) : ");
            play = sc.nextBoolean();
        }
    }
}
