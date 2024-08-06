import java.util.Scanner;

public class TakingInputFromUser {
    public static void main(String[] args)
    {
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = sc.nextLine();
        System.out.print("Enter your age : ");
        age = sc.nextInt();
        System.out.println("Thanks For answering ! Your name is "+name+" and your age is "+age);
        boolean b = sc.hasNextInt();
        System.out.println(b);
    }
}
