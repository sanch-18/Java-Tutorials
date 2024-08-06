import java.util.Scanner;

class thread1 extends Thread{
    public void run()
    {
        for(int i=0;i<4000;i++)
        {
            System.out.println("Heyy I am thread1 and I love to cook");
        }
    }
}

class thread2 extends Thread{
    public void run()
    {
        for(int i=0;i<4000;i++)
        {
            System.out.println("Heyy I am thread2 and I love to dance");
        }
    }
}

class thread3 implements Runnable{
    public void run(){
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

class newthread implements Runnable{
    public void run(){
        while(true)
        {
            System.out.println("Hello I am Runnable");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e.fillInStackTrace());
            }
        }
    }
}

public class Multithreading {
    public static void main(String[] args)
    {
        /*thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();*/
        newthread t4 = new newthread();
        thread3 t3 = new thread3();
        Thread t = new Thread(t3);
        Thread T = new Thread(t4);
        t.setPriority(Thread.MAX_PRIORITY);
        T.setPriority(Thread.MIN_PRIORITY);
        t.start();
        T.start();
    }
}
