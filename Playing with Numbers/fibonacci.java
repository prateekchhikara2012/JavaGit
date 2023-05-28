import java.util.Scanner;
public class fibonacci
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int a=0,b=1 ,sum;
        // int count=1;
        // while(count<=num)
        // {
        //     System.out.print (a+ " ");
        

        //     sum=a+b;
        //     a=b;
        //     b=sum;


        //     count++;
        // }//second methord is this
        for(int i=1;i<=num;i++)
        {
            System.out.println(a);
            sum=a+b;
            a=b;
            b=sum;
        }
        sc.close();
    }
}