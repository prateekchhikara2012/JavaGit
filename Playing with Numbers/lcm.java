import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int n2=sc.nextInt();
        int max= Math.max(n1, n2);
        // int max=n1>n2?n1:n2
        int no=max;
        while(no<=n1*n2)
        {
            if(no%n1==0 && no%n2==0)
            {
                System.out.println("lcm is "+ no);
                break;
            }
            no++;

        }

        sc.close();

    }
    
}
