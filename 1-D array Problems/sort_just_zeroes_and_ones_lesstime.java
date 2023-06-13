public class sort_just_zeroes_and_ones_lesstime {
    


    public static void main(String[] args) {
        int arr[]={0,0,1,0,1,0,0,1,0,0,0};
        int i=0;
        int j=arr.length-1;

        while(i<j)
        {
            if(arr[i]==1)
            {
                if(arr[j]==0)
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                else
                {
                    j--;
                }
            }
            else
            {
                i++;
            }
           
        }
        for(int traverse:arr)
        {
            System.out.print(traverse+" ");
        }

       
    }
}

