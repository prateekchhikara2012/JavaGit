import java.util.Scanner;

public class j__print_char
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s_1=new String(sc.next());
        print(s_1);
        sc.close();
    }
    public static void print(String a) 
    {
        for(int i=0;i<a.length();i++)
        {
            System.out.println(a.charAt(i));
        }
    }
}