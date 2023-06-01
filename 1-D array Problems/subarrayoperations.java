import java.util.Scanner;

public class subarrayoperations 
{

    //operations on subarray
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the size of a array");
        
        int num=sc.nextInt();
        int [] arr=new int [num];

        System.out.println("enter the elements of a array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        

       // printingsubarray(arr);             // for printing the subarray
       // sumofsubarrayusingthreeloops(arr); // using 3 loops finding the sum of subarray
       // sumofsubarrayusingtwoloops(arr);   // using 2 loops finding the sum of subarray
       // maxsubarray(arr);                  // to find out the maximum subarray 
        sc.close();
}


public static void printingsubarray(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
            {
                for(int j=i;j<arr.length;j++)
                {
                    for(int k=i;k<=j;k++)
                    {
                        System.out.print(arr[k]+ " ");
                    }

                    System.out.println();
                }
            }
    }

public static void sumofsubarrayusingthreeloops(int [] arr)
    {

        for(int i=0;i<arr.length;i++)
            {
                for(int j=i;j<arr.length;j++)
                {   
                   int sum=0;
                    for(int k=i;k<=j;k++)
                    {
                        sum=sum+arr[k];
                    }
                    System.out.println(sum);
                }
            }
    }

public static void sumofsubarrayusingtwoloops(int []arr)
{

    for(int i=0;i<arr.length;i++)
    {
        int sum=0;
        for(int j=i;j<arr.length;j++)
        {
            sum=sum+arr[j];
            System.out.println(sum);
        }
    }

}

public static void maxsubarray(int [] arr)
{
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++)
    {
        int sum=0;
        for(int j=i;j<arr.length;j++)
        {
            sum=sum+arr[j];
            if(max<sum)
            {
                max=sum;
            }
        }
    }
    System.out.println(max);

}




}
    

