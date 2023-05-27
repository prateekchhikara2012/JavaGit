import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a>b?a:b;i<=a*b;i++)
        {
            if(i%a==0 && i%b==0)
            {
                System.out.println(i);
                break;
            }
        }
        sc.close();

    }
    
}
