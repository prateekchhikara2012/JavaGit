import java.util.Scanner;
public class hcfascending 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int limit= a<b?a:b;
        int i=1;
        int hcf=0;
        while(i<=limit)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
            i++;
        }
        System.out.println("hcf is "+ hcf);
        sc.close();
    }    
}
