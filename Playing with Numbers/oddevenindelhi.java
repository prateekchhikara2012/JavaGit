import java.util.Scanner;

public class oddevenindelhi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int num=sc.nextInt();
        int b,count=0;
        while(num>0)
        {
            b=num%10;
            count=count+b;
            num=num/10;
        }
        System.out.println(count);
        if(count%2==0)
        {
             if(count%4==0)
             {
                  System.out.println("yes");
             }
             else
             {
                System.out.println("no");
             }
        }
        else
        {
            if(count%3==0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("no");
            }
        }
        sc.close();

    }
    
}
