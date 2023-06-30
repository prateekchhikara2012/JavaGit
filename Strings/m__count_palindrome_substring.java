import java.util.Scanner;

public class m__count_palindrome_substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.next();

        palindrome_substring(a);

        sc.close();

      
        
    }
    public static void palindrome_substring(String a)//sub-string finder
    {
        
        int all=0;
        for(int i=0;i<a.length();i++)
        {
            for(int j=i+1;j<=a.length();j++)
            {

                if(count(a.substring(i,j)))
                {
                    all++;
                }
            }
        }
        System.out.println(all);

    }
    public static boolean count(String a)//palindrome finder for the specific sub string
    {
        int i=0;
        int j=a.length()-1;
        while(i<j)
        {
            if(a.charAt(i)==a.charAt(j));
            else{
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
    
    
}
