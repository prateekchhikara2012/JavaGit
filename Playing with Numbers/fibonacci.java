import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1;
        int sum=0;
        int num=sc.nextInt();
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
