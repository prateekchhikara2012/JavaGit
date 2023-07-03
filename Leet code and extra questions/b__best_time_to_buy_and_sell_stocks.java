public class b__best_time_to_buy_and_sell_stocks {
    public static void main(String[] args) {
        //leetcode
        // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

        int arr[]={2,7,5,1,3,8,3};
        int min=Integer.MAX_VALUE;
        int diff=0;
        int max=diff;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            else
            {
                diff=arr[i]-min;
                if(max<diff)
                {
                    max=diff;
                }
            }
        }

        System.out.println(max);
    }
    
}
