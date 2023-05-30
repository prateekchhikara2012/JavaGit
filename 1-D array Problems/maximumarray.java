public class maximumarray {
    public static void main(String[] args) {
        int [] arr={10,50,30,90,60};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    
}
