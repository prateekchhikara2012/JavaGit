import java.util.Scanner;

public class c__Strings_Count_Palindromic_Substrings {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String s= sc.next();

        int count=0;
        for(int i=0;i<s.length();i++)
        {
    
            for(int j=i+1;j<=s.length();j++)
            {

                if(check(s.substring(i, j)))
                {
                    count++;
                }
            }
        }
        System.out.println(count);



        sc.close();

    }
    public static boolean check(String s) {


        int i=0;;
        int j=s.length()-1;

        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j));
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
