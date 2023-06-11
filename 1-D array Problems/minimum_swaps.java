
// import java.util.Scanner;

public class minimum_swaps {
    public static void main(String[] args) {
        //  Scanner sc=new Scanner(System.in);
        //  int arr[]=new int[sc.nextInt()];
        //  for(int i=0;i<arr.length;i++)
        //  {
        //      arr[i]=sc.nextInt();
        //  }
        // count(arr);
        // sc.close();


   int arr[]={1,2,3,4};
   count(arr);

    }

    public static void count(int arr[])
    {
        int  count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if((i+1)==arr[j])
                {
                    int temp=arr[i-1];
                    arr[i-1]=arr[j];
                    arr[j]=temp;
                    count++;
                }
            }
        }
        System.out.println(count);


        // int abc[]=new int [arr.length];
        // for(int i=0;i<abc.length;i++)
        // {
        //     abc[i]=arr[i];
        // }
        // Arrays.sort(abc);


        // int counting=0;

        // for(int i=1;i<=arr.length;i++)
        // {
        //     for(int j=0;j<=arr.length-1;j++)
        //     {
        //         if(arr[j]==i && j+1 != i)//---------- important line
        //         {
        //             int temp=arr[i-1];
        //             arr[i-1]=i;
        //             arr[j]=temp;
        //             counting++;
        //         }
        //     }
        // //    for(int j=0;j<arr.length;j++)
        // //    {
        // //        System.out.print(arr[j]+" ");
        // //    }
        // //    System.out.println();


        //     if(Arrays.equals(abc, arr))
        //     {
        //         System.out.println(counting);
        //         break;
        //     }
        // }

    }
    
}