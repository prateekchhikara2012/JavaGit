public class rotationofarraydirectusingoneloopandsinglearray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        rotate(arr,0,1);
         rotate(arr, 2,5);
        rotate(arr,0,5);
        for(int i :arr)
        {
            System.out.println(i);
        }
    }
    public static void rotate(int []arr,int i,int j)
    {

        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }


    }

    
}
