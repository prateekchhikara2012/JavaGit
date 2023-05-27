import java.util.Scanner;

public class printreverse {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in) ;
       int num=sc.nextInt();
       int b=0,c=0;
       while(num>0)
       {
        b=num%10;
        c=c*10+b;
        num=num/10;
       }
       System.out.println(c);
       sc.close();
    }
    
}
