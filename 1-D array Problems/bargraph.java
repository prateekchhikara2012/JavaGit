public class bargraph {
    public static void main(String[] args) {
        int [] arr={2,5,8,3,1};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        for(int row=1;row<=max;row++)
        {

            for(int col=0;col<arr.length;col++)
            {
                if(row<=max-arr[col])
                {
                    System.out.print(" \t");
                }
                else
                {
                    System.out.print("* \t");
                }
            }
            System.out.println();
        }

    }
    
}
