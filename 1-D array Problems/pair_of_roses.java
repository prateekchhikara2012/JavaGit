import java.util.Scanner;


public class pair_of_roses {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        
        int num=sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            int n=sc.nextInt();
            find(n);
        }

    }
    public static void find(int n)
    {
        int arr[] =new int [n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        
        int total=sc.nextInt();
        
        int first=0;
        int last=0;

        int i=0,j=arr.length-1;
        while(i<j)
        {
            if(arr[i]+arr[j]<total)//70
            {
                i++;
            }
            else if(arr[i]+arr[j]>total)
            {
                j--;
            }
            else
            {
                first=arr[i];
                last=arr[j];
                i++;
                j--;
            }
        }
        System.out.println("Deepak should buy roses whose prices are "+ first+" and "+ last+".");



    }
    
}
