import java.util.Scanner;

public class g__Strings_Odd_Even_Character
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        StringBuilder sd=new StringBuilder("");
        String str=sc.next();
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
            {
                int x=str.charAt(i)+1;
                sd.append((char)(x));
            }
            else
            {
                int x=str.charAt(i)-1;
                sd.append((char)(x));
            }
        }

        System.out.println(sd);



        sc.close();
    }
}