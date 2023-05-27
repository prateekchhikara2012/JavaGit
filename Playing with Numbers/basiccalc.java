import java.util.Scanner;

public class basiccalc
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        while(true)
        {
            if(ch=='x' || ch=='X')
            {
                break;

            }
            else
            {
                int num_1=sc.nextInt();
                int num_2=sc.nextInt();
                if(ch=='+')
                {
                    System.out.println(num_1+num_2);
                }
                else if(ch=='-')
                {
                    System.out.println(num_1-num_2);
                }
                else if(ch=='*')
                {
                    System.out.println(num_1*num_2);
                }
                else if(ch=='-')
                {
                    System.out.println(num_1/num_2);
                }
                else if(ch=='%')
                {
                    System.out.println(num_1%num_2);
                }
                else
                {
                    System.out.println("INvalid operator");
                }
                sc.close();
            }
        }
    }
}
