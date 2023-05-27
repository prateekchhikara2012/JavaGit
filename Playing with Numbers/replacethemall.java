import java.util.Scanner;

public class replacethemall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(),b,c=0,i=0;
        while(num>0)
        {
            b=num%10;
            if(b==0)
            {
                b=5;

            }
            c=c+b*(int)(Math.pow(10,i));
            i++;
            num=num/10;

        }
        System.out.println(c);
        sc.close();
    }
    
}

