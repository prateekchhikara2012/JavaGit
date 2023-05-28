import java.util.Scanner;
public class hcffastest {
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        int dividend=sc.nextInt();
        int divisor=sc.nextInt();
        // int = Math.max(a,b);
        // int =Math.min(a,b);
        int rem=1 ;
        while(true)
        {
            
           rem= dividend%divisor;
           if (rem==0)
           break;

           dividend=divisor;

           divisor=rem;

        }
        System.out.println(divisor);
 
        sc.close();


    }
    
}
