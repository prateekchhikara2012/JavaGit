import java.util.Arrays;
import java.util.Scanner;

public class j__Jumbles
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // in this we are converting the string to the char array


        String one=sc.next();
        String two=sc.next();


        char [] a =one.toCharArray(); // main point
        char [] b= two.toCharArray();



        Arrays.sort(a);
        Arrays.sort(b);

        if(check(a,b))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

        sc.close();

    }
    public static boolean check(char[] a , char [] b)
    {

        if(a.length!=b.length)
        {
            return false;    
        }

        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i])
            {
                return false;
            }
        }

        return true;

    }
}