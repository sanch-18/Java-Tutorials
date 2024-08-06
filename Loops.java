public class Loops {
    public static void main(String[] args) {
        int i = 0;
        while(i<=3) {
            System.out.println(i);
            i++;
        }
        i = 4;
        do{
            System.out.println(i);
            i++;
        }while(i<=3);
        for(int j=0;j<10;j++)
        {
            if(j==1)
                continue;
            if(j==7)
                break;
            System.out.println(j);
        }
    }
}
