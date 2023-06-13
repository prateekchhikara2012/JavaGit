public class next_permutation {
    public static void main(String[] args) {
        int arr[]={1,3,5,4,2};

        int i=arr.length-1;

        while(arr[i-1]>arr[i])
        {
            i--;
        }


        int j=arr.length-1;

        while(arr[i-1]>arr[j])
        {
            j--;
        }


        int temp=arr[j];
        arr[j]=arr[i-1];
        arr[i-1]=temp;


        j=arr.length-1;


        while(i<j)
        {
            int swap=arr[i];
            arr[i]=arr[j];
            arr[j]=swap;

            i++;
            j--;
        }

        for(int ki=0;ki<arr.length;ki++)
        {
            System.out.print(arr[ki]+" ");
        }



    }
    
}
