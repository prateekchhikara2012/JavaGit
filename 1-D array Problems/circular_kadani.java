public class circular_kadani {
    public static void main(String[] args) {

        // In this program we have found the circular array max sum using kadani

        // There are 2 scenarios 1> contributing elements are not wrapping 
        //                       2> Contributing elements are wrapping

        //  for 1> we can directly apply kadani 

        //  for 2> we have Contributing elements are wrapping == non-contributing elements are not wrapping.
        //         so keeping this in mind... 
        //         contributing elements sum = total sum - non-contributing elements sum
        //         For non-contributing elements sum we first inversed the array and than applied kadani on it
        //         The result will be in postive as we have inversed the array...So be Carefull while doing this

       int arr[]={10,-12,-5,3,11};
       //int arr[]={ 8, -8, 9, -9, 10, -11, 12};

        int nonwrapping=kadani(arr); // first scenario

        // work for second scenario
        
        int total_sum=0;
        for(int i=0;i<arr.length;i++)
        {
            total_sum=total_sum+arr[i];
            arr[i]=-arr[i];
        }

        int max_2=kadani(arr); // Second Secnario

        int wrapping=total_sum-(-max_2);

        
        System.out.println(Math.max(nonwrapping,wrapping));

    }
    public static int kadani(int [] arr)
    {
        int sum=arr[0];
        int max=sum;
        for(int i=1;i<arr.length;i++)
        {
            sum=Math.max(arr[i], sum+arr[i]);
            if(sum>max)
            {
                max=sum;
            }
        }

        return max;
    }
    
}
