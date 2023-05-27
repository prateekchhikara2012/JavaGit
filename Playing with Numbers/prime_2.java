import java.util.Scanner;

public class prime_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        // for(int i=2;i<num;i++)
        // {
        //     if(num%i==0)
        //     {
        //         System.out.println("not prime");
        //         count++;
        //         break;
        //     }
        // }
        // if(count==0)
        // {
        //     System.out.println("prime");
        // }
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count>=3)
        {
            System.out.println("Not prime");
        }
        else
        {
            System.out.println("prime");
        }
        sc.close();
    }
    
}
