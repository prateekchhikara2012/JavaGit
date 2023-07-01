import java.util.Scanner;

public class c__String_max_frequency_character {
    static char ch;
    static int max=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.next();

        for(int i=0;i<a.length();i++)
        {
            int num=0;

            for(int j=i;j<a.length();j++)
            {
                if(a.charAt(i)==a.charAt(j))
                {
                    num++;
                }
            }
            if(max<num)
            {
                max=num;
                ch=a.charAt(i);
            }
        }

        System.out.println(ch);
        sc.close();



    }
    
}
