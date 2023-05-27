import java.util.Scanner;

public class chwebecca {
    
    public static void main(String[] args) {
    //    Scanner sc=new Scanner(System.in);
    //    int num=sc.nextInt();
    //    int b,c=0,i=0;
    //    while(num>0)
    //    {
    //     b=num%10;
    //     if(b>=5)
    //     {
    //         if(b==9 && (num/10)==0);
    //         else
    //         {
    //             b=9-b;//b=9;
    //         }
    //     }
    //     c=c+b*(int)(Math.pow(10, i));
    //     i++;
    //     num=num/10;
    //    }
    //    System.out.println(c);


    // --------------------both are fine----------------=---
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int b,c=0,i=0;
    while(num>0)
    {
        b=num%10;
        
        if(b==9 && (num/10)==0);
        else
        {
            if(b>=5)
        {
            b=9-b;
        }
        }
        c=c+b*(int)(Math.pow(10,i));
        i++;
        num=num/10;
    }
    System.out.println(c);
       sc.close();
    }
    
}
