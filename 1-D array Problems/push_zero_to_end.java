import java.util.Scanner;

public class push_zero_to_end
{
    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
       int arr[]=new int[sc.nextInt()];
       for(int i=0;i<arr.length;i++)
       {
            arr[i]=sc.nextInt();
       }
       
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                for(int j=arr.length-1;j>i;j--)
                {
                    if(arr[j]==0);
                    else
                    {
                        int temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                        break;
                    }
                }
            }
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        sc.close();
    }
}