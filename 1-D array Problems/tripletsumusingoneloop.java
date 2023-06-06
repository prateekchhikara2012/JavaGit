public class tripletsumusingoneloop
{
    //Question :-- Find the triplet sum using the 1 loop only, the sum =target
    // precondition- the array should be in sorted order
    public static void main(String[] args) {
        //array should be in sorted order
        int arr[]={10,20,30,40,50,60,70,80,90};

        int target=100;


        int i=0,j=i+1,k=arr.length-1;
        while(j<k)
        {
            if(arr[i]+arr[j]+arr[k]<target)
            {
                j++;
            }
            else if(arr[i]+arr[j]+arr[k]>target)
            {
                k--;
            }
            else
            {
                System.out.println(arr[i]+" "+arr[j]+" "+ arr[k]);
                j++;
                k--;
            }


            if(j>=k)
            {
                i++;
                j=i+1;
                k=arr.length-1;
            }

        }

        
    }
}