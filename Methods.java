public class Methods {
    static int sum(int ...arr) // The numbers sent to the function are packed in an array and sent
    {
        int res = 0;
        for(int i=0;i< arr.length;i++)
        {
            res += arr[i];
        }
        return res;
    }
    static int natural(int n)
    {
        if(n==1)
            return 1;
        return n+natural(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 5));
        System.out.println(natural(10));
    }

}
