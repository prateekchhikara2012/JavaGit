import java.util.Scanner;

public class h__Strings_Toggle_Case
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        //a >=97

        StringBuilder sd=new StringBuilder("");
        for(int i=0;i<str.length();i++)
        {
            if((int)(str.charAt(i))>=97)
            {
                sd.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                sd.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println(sd);
        sc.close();
    }
}