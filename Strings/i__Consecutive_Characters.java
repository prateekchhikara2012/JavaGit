import java.util.Scanner;

public class i__Consecutive_Characters
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        int i=0,j=0;

        int sum=0;
        int max=Integer.MIN_VALUE;
        while(i<str.length()-1 && j<str.length()-1)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                sum++;
                j++;
            }
            else
            {
                if(sum>max)
                {
                    max=sum;
                }
                sum=0;
                i=j;
            }
        }
        System.out.println(max);
        sc.close();
    }
}