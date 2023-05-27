import java.util.Scanner;
public class countdigits
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);    
        int num=sc.nextInt();
        int repeat=sc.nextInt();
        int b,count=0;
        while(num>0)
        {
            b=num%10;
            if(b==repeat)
            {
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
        sc.close();

    }
}