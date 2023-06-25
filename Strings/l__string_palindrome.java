import java.util.Scanner;
public class l__string_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.next();//nitin
        boolean x= palindrome(a);
        System.out.println(x);


        
        sc.close();
    }

    public static boolean palindrome(String a)
    {
        int i=0;
        int j=a.length()-1;

        while(i<=(a.length()-1)/2)
        {
            if(a.charAt(i)==a.charAt(j));
            else
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}
