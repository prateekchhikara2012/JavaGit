import java.util.Scanner;

public class inverseusingnumbers {

    // elements in the number should be >=1 a 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int count=1;
        while(num>0)
        {
            int b=num%10;
            sum=sum+count*(int)Math.pow(10,b-1);
            num/=10;
            count++;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
