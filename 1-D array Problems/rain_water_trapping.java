public class rain_water_trapping {
    public static void main(String[] args) {
        int arr[]={3,  0,  0,  2,  0,  4};

        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            int left_max=0;
            int right_max=0;


            for(int j=i;j>=0;j--)
            {
                if(left_max<arr[j])
                {
                    left_max=arr[j];
                }
            }

            for(int j=i;j<arr.length;j++)
            {
                if(right_max<arr[j])
                {
                    right_max=arr[j];
                }
            }



            int mini=(Math.min(left_max, right_max))-arr[i];
            sum=sum+mini;

        }
        System.out.println(sum);
    }
    
}
