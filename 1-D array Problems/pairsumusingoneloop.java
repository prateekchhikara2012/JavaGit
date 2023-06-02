public class pairsumusingoneloop {
    public static void main(String[] args) {

        // ------- should be in sorted order------
        int arr[]={10,20,30,40,50,60,70,80,90};
        int target=110;
        int i=0,j=arr.length-1;
        while(i<j)
        {
            if(arr[i]+arr[j]>target)
            {
                j--;
            }
            else if(arr[i]+arr[j]<target)
            {
                i++;
            }
            else
            {
                System.out.println(arr[i]+ " "+ arr[j]);
                i++;
                j--;
            }
        }


    }
    
}
