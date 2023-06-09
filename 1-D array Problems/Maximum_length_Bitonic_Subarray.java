public class Maximum_length_Bitonic_Subarray {
   
   
    static int  max =Integer.MIN_VALUE;
    public static void main(String[] args) {
        int arr[]={5,2,8,9,6,5,10};
        
        for(int i=0;i<arr.length;i++)//i=starting
        {
            for(int j=i;j<arr.length;j++)// j=ending
            {
                
                check(arr,i,j);
            }
        }
        System.out.println(max);
    }
    public static boolean check(int [] arr, int si,int ei)
    {
        int i=si;
        int j=ei;

        for(i=si;i<j-1;i++)
        {
            if(arr[i]<arr[i+1]);
            else
            break;
        }
        for(j=ei;j>i;j--)
        {
            if(arr[j]<arr[j-1]);
            else
            return false;
        }
        if((ei-si+1)>max)
        {
            max=ei-si+1;
        }

        return true;


    }
    
}
