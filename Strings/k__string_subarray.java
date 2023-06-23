import java.util.Scanner;

public class k__string_subarray {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        //enter the string 
        String s_1=new String(sc.next());


        subarray_using_three_loop(s_1);

        subarray_using_two_loop(s_1);
        
        sc.close();
    }
    public static void subarray_using_three_loop(String a)
    {
        for(int i=0;i<a.length();i++)
        {
            for(int j=i;j<a.length();j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(a.charAt(k)+" ");
                }
                System.out.println();
            }
        }
    }
    public static void subarray_using_two_loop(String a)
    {
        for (int i=0;i<a.length();i++)
        {
            for(int j=i+1;j<=a.length();j++)
            {
                System.out.println(a.substring(i,j));
            }
        }
    }

    
}
