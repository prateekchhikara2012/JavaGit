public class kadanis_alogrithm_operations {
    public static void main(String[] args) {


        // ------ Kadani algorithm is used to find the maximum sub array using 1 loop only
        // ------ but i have modified this program to print the subarray also (subarray print + subarray max sum)

        
        int [] arr= {2 ,3,-6,1,2,3,-4,5,-10,6};
        
        int sum=arr[0];
        int max=arr[0];

        int ending_index=0;
        int starting_index=0;
        int j=0;


        for(int i=1;i<arr.length;i++)
        {
            sum=Math.max(arr[i],sum+arr[i]);

            if(sum==arr[i])//---- finding out all the staring index
            {
                starting_index=i;
            }

            if(max<sum)
            {
                max=sum;
                ending_index=i;// it is ending index

                if(starting_index<max)// -- as starting index should be always less than max(final starting index will be j)
                {
                    j=starting_index;
                }
            }

            
        }
        System.out.println("max sum in sub array = " + max);// too find max sum in sub array
        
        for(int i=j;i<=ending_index;i++)
        {
            System.out.print(arr[i]+ " ");
        }

    }
    
}
