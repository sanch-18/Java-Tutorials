import java.util.Scanner;

public class CBSEpercentage {
    public static void main(String[] args) {
        float maths, programming, english, sports, science;
        System.out.print("Enter the maximum marks of each subject : ");
        Scanner sc = new Scanner(System.in);
        float total = sc.nextInt();
        System.out.print("Enter your English marks : ");
        english = sc.nextInt();
        System.out.print("Enter your Maths marks : ");
        maths = sc.nextInt();
        System.out.print("Enter your Science marks : ");
        science = sc.nextInt();
        System.out.print("Enter your Sports marks : ");
        sports = sc.nextInt();
        System.out.print("Enter your Programming marks : ");
        programming = sc.nextInt();
        total = 5*total;
        float percentage = ((english+maths+science+sports+programming)*100)/total;
        System.out.println("Your overall percentage is : "+percentage);
    }
}
