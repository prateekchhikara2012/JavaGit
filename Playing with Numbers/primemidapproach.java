import java.util.Scanner;

public class primemidapproach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                System.out.println("Not prime");
                count=1;
                break;
            }
        }
        if(count==0)
        {
            System.out.println(" prime");
        }
        sc.close();
    }
    
    
}
