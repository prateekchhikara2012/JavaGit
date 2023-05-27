import java.util.Scanner;

public class printarmstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num_2=sc.nextInt(),b,count,mul=0;
        for(int i=num;i<=num_2;i++)
        {
            int temp=i;
            count=0;
            while(i>0)
            {
                b=i%10;//remainder
                count++;
                i=i/10;
            }
            i=temp;
            mul=0;
            while(temp>0)
            {
                b=temp%10;
                mul=mul+(int)(Math.pow(b,count));
                temp=temp/10;

            }
            if(mul==i)
            {
                System.out.println(i);
            }

        }
        sc.close();
    }
    
}
