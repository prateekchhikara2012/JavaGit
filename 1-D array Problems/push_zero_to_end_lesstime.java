public class push_zero_to_end_lesstime {
   

    public static void main(String[] args) {
        int arr[]={0,2,3,0,0,1,0,2,0};
        int i=0;
        int j=arr.length-1;

        while(i<j)
        {
            if(arr[i]==0)
            {
                if(arr[j]!=0)
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j--;
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

