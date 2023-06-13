import java.util.Scanner;

public class arraymaxvalueinarray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int [] arr= new int [num];


        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int max=Integer.MIN_VALUE;
        for(int i:arr)
        {
            if(i>max)
            {
                max=i;
            }

        }
        System.out.println(max);

        
        sc.close();
    }
}