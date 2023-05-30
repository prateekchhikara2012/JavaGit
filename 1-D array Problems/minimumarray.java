public class minimumarray {
    public static void main(String[] args) {
        //to find out minimum in array

        int arr[]={10,50,30,90,60,5,45};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);

    }
    
}
