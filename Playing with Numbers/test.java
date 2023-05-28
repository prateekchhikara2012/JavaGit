import java.util.*;
public class test {
    public static void main(String args[]) 
    {
        Scanner scn = new Scanner(System.in);
        int num=scn.nextInt();
        int b,i=1,odd=0,even=0;
        while(num>0)
        {
            b=num%10;
            if(i%2==0)
            {
                even=even+b;
            }
            else
            {
                odd=odd+b;
            }
            i++;
            num=num/10;
        }
        System.out.println(even);
        System.out.println(odd);
        scn.close();
        

}}