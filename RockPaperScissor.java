import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args)
    {
        int userchoice;
        int compchoice;
        String result;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter your choice\n1) 1 for rock\n2) 2 for paper \n3) 3 for scissor : ");
        userchoice = sc.nextByte();
        compchoice = rand.nextInt(3)+1;
        if(compchoice==userchoice)
        {
            result = "Draw";
        }
        else if(userchoice==1)
        {
            if(compchoice==2)
                result = "Loss";
            else
                result = "Win";
        }
        else if (userchoice==2)
        {
            if(compchoice==1)
                result = "win";
            else
                result = "Loss";
        }
        else if(userchoice==3)
        {
            if(compchoice==1)
                result = "Loss";
            else
                result = "Win";
        }
        else
        {
            result = "error";
        }
        System.out.println("Computer chosed "+compchoice+" You have faced "+result);
    }

}
