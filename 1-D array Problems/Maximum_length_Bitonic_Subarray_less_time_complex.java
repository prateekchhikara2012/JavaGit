public class Maximum_length_Bitonic_Subarray_less_time_complex {
    public static void main(String[] args) {

        int arr[]={5,2,8,9,6,5,10};

        int inc[]=new int[arr.length];

        int dec[]=new int[arr.length];


        int total[]=new int[arr.length];

        int val=1;

        inc[0]=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                val=1;
                inc[i]=val;
            }
            else
            {
                val++;
                inc[i]=val;
            }

        }

        val=1;
        dec[arr.length-1]=1;

        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>arr[i+1])
            {
                val++;
                dec[i]=val;
                
            }
            else
            {
                val=1;
                dec[i]=val;
            }
        }

        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            total[i]=(inc[i]+dec[i])-1;
            if(total[i]>max)
            {
                max=total[i];
            }
        }
        System.out.println(max);





    }
    
}
