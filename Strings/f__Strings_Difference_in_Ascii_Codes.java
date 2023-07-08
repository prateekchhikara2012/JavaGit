import java.util.Scanner;

public class f__Strings_Difference_in_Ascii_Codes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();

        String ms="";
        for(int i=0;i<a.length()-1;i++)
        {
            int x=a.charAt(i+1) - a.charAt(i);
            ms=ms+a.charAt(i)+x;
        }
        System.out.println(ms+a.charAt(a.length()-1));
        sc.close();
    }
    
}
