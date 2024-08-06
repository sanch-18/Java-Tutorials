import java.util.Scanner;

public class literals_and_operators {
    public static void main(String[] args) {
        String name = "Sancho";
        System.out.println(name);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int x = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int y = sc.nextInt();
        System.out.println(x+y);
        System.out.println(64>5 || 2>3);
        System.out.println(x|y);
        System.out.println((char)('A'+2));
    }
}
