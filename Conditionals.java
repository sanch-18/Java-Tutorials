import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args)
    {
        int age;
        System.out.print("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        /*if(age>=21)
        {
            System.out.println("Yess Man! You can Drive and get married");
        }
        else if(age>=18)
        {
            System.out.println("You can drive but can't get married");
        }
        else
        {
            System.out.println("You can neither drive nor get married");
        }*/
        switch(age)
        {
            case 18:
                System.out.println("You are gonna enjoy life");
                break;
            case 21:
                System.out.println("You are gonna fuck someone");
                break;
            case 25:
                System.out.println("You are gonna get married");
                break;
            case 26:
                System.out.println("You are gonna be a dad");
                break;
            case 30:
                System.out.println("You are going to get divorced");
                break;
            default:
                System.out.println("You are going to fuck yourself");
        }
    }
}
