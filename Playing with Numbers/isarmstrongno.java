import java.util.Scanner;

public class isarmstrongno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num_1=num,b;
        int count=0;
        
        while(num>0)
        {
            b=num%10;
            count++;
            num=num/10;
        }
        num=num_1;
        int mul=0;
        for(int i=1;i<=count;i++)
        {
            b=num%10;
            mul=mul+(int)(Math.pow(b,count));
            num=num/10;

        }
        sc.close();
        if(mul==num_1)
        System.out.println("amstrong");
        else
        {
            System.out.println("not armstrong");
        }

    }
    
}
