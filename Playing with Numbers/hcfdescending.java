import java.util.Scanner;
public class hcfdescending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count  =Math.min(a,b);
        int min=count;
        while(min>=1)
        {
             if(a%min==0 && b%min==0)
             {
                System.out.println("hcf is "+min);
                break;
             }
            min--;
        }
        sc.close();
    }
}
