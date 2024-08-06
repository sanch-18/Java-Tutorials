public class Arrays {
    public static int search(float[] arr, float target)
    {
        int n = arr.length;
        int start =0,end = n-1;
        int mid;
        int ans = -1;
        while(start<=end)
        {
            mid = (start+end)/2;
            if(arr[mid]>target)
            {
                end = mid - 1;
            }
            else if(arr[mid]<target)
            {
                start = mid + 1;
            }
            else
            {
                ans = mid;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        /*int[] marks = new int[5];
        for(int i=0;i<marks.length;i++)
        {
            marks[i] = 10*i;
        }
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println(marks.length);

        // Multidimensional array
        float[][] flats;
        flats = new float[2][4];
        for(int i=0;i< flats.length;i++)
        {
            for(int j=0;j<flats[0].length;j++)
            {
                flats[i][j] = i+j;
            }
        }
        for(int i=0;i< flats.length;i++)
        {
            for(int j=0;j<flats[0].length;j++)
            {
                System.out.println(flats[i][j]);
            }
        }*/
        float sum = 0f;
        float[] arr = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.println(search(arr, 1.0f));
    }
}
