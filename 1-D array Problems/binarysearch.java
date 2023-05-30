public class binarysearch {
    public static void main(String[] args) {
        //-----please note that in binary search there is a prerquiest, it can be only
        //applied on the sorted array --------

       // Scanner sc=new Scanner(System.in);

       int [] arr={10,20,30,40,50,60,70};//0-9
       int low=0,high=arr.length-1;

       int num=70;

       int mid=0;
       while(low<=high)
       {

        mid=(low+high)/2;

        if(num<arr[mid])
        {
            high=mid-1;
        }
        else if(num>arr[mid])
        {
            low=mid+1;
        }
        else if(num==arr[mid])
        {
            System.out.println(mid);
            break;
        }

       }




        
        
    }
    
}
