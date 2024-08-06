import java.util.Scanner;

public class strings {
    public static void main(String[] args)
    {
        String name = new String("Hello I am here");
        System.out.println(name);
        int n=7;
        float a = 5.4f;
        double b = 4.4;
        char c = '#';
        String d = "Sancho";
        System.out.printf("The numbers are %d, %.2f, %5.2f, %c, %s\n", n, a, b, c, d);

        // String Methods

        System.out.println(d.length());               // 1)
        System.out.println(d.toLowerCase());          // 2)
        System.out.println(d.toUpperCase());          // 3)
        String str = "     jhdihdc ksdk,sm    ";
        System.out.println(str.trim());               // 4)
        System.out.println(d.substring(2)); // 5)
        System.out.println(d.replace('o', 'i')); // 6)
        System.out.println(d.replace("San", "o"));

        System.out.println(d.startsWith("San")); // 7)
        System.out.println(d.endsWith("San")); // 8)
        System.out.println(d.charAt(2)); // 9)
        System.out.println(d.indexOf("an")); // 10)
        System.out.println(d.indexOf("an", 2));
        System.out.println(d.lastIndexOf('o'));  // 11)

        System.out.println(d.equals("Sancho")); // 12)

        String url;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your website URL : ");
        url = sc.nextLine();
        if(url.endsWith(".com"))
            System.out.println("It's a commercial website");
        else if(url.endsWith(".org"))
            System.out.println("It's a organisational website");
        else if(url.endsWith(".in"))
            System.out.println("It's an indian website");
        else
            System.out.println("It's an invalid website");
    }
}
