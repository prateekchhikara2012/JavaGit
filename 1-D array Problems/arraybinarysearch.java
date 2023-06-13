import java.util.Scanner;

public class arraybinarysearch {
    

    // first the array should should be in ascending order


//  If M is found in the Array the index of M is returned else -1 
//  is returned and print the value returned.


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        int num=sc.nextInt();

        int [] arr=new int[num];


        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int m=sc.nextInt();// for finding the number

       

        int res=finding(arr,m);



        System.out.println("array index is " + res);


    }

    public static int finding(int [] arr ,int m)
    {
        int low=0, high=arr.length-1;
        int mid=0;



        while(low<=high)
        {
            mid=(low+high)/2;

            if(m<arr[mid])
            {
                high=mid-1;
            }

            else if(m>arr[mid])
            {
                low=mid+1;
            }


            else if(m==arr[mid])
            {
                return mid;
            }

        }




        return -1;
    }
    
}

    

