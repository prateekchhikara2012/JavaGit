import java.util.Scanner;
public class calculate_the_sum {
    static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        
       
        int num=sc.nextInt();

        int arr[] =new int[num];

        System.out.println("enter the input of the first array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("enter teh querie size");
        int queries=sc.nextInt();
        for(int i=1;i<=queries;i++)
        {
            System.out.println("enter the rotaion");
            int find=sc.nextInt();
            
            arr=rot(arr,find);
        }

        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }

        int total=sum%((int)(Math.pow(10, 9))+7);
        System.out.println(total);


    }

    public static int [] rot(int arr[],int find)
    {
        //find =1
        int abc[]=new int [arr.length];

        

        
        for(int i=0;i<arr.length;i++)
        {
            abc[i]=arr[i];
        }
        int rotations;
        for(int i=abc.length-1;i>=0;i--)//find=2
        {
            int temp=i-find;
            if(temp>=0)
            {
                rotations=temp;
            }
            else
            {
                rotations=temp+abc.length;
            }


            abc[i]=abc[i]+arr[rotations];

        }
        arr=abc;

        return abc;

    }
    
}
