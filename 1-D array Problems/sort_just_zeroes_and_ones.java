public class sort_just_zeroes_and_ones {
    public static void main(String[] args) {
        int arr[]={0,0,0,1,1,0,1,0,1,0};
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                for(j=arr.length-1;j>i;j--)
                {
                    if(arr[j]==0)
                    {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }

                }
            }
            
        }
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
    
}
