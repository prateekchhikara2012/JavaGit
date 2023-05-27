import java.util.Scanner;

public class simpleinput {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num,sum=0,temp=0;
        while(true)
        {
            num=sc.nextInt();
            sum=sum+num;
            if(sum<0)
            {
                break;
            }
            temp=sum;
        }
        System.out.println(temp);
        sc.close();
    }
}