import java.util.Scanner;

public class Loops_practise {
    public static void main(String[] args) {
        // pattern
        /*for(int i = 0;i<4;i++)
        {
            for(int j=i;j<4;j++)
            {
                System.out.print("* ");
            }
            System.out.println("\n");
        }*/

        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            sum = sum + 2*i;
        }
        System.out.println(sum);
    }
}
