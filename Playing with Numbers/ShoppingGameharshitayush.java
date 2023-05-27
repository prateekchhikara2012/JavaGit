import java.util.Scanner;

public class ShoppingGameharshitayush

{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int m=sc.nextInt();
        int n=sc.nextInt();


        int m_sum=0;
        int n_sum=0;
        for(int i=1;i<=(m>n?m:n);i++)
        {
            if(i%2!=0)
            {
                m_sum=m_sum+i;
                if(m_sum>m)
                {
                    System.out.println("n wins");
                    break;
                }
            }
            else
            {
                n_sum=n_sum+i;
                if(n_sum>n)
                {
                    System.out.println("m wins");
                    break;   
                }
            }
        }
        sc.close();
    }
}