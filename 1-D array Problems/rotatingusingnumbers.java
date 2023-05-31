
import java.util.Scanner;

public class rotatingusingnumbers {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int num=sc.nextInt();
        // int temp_num=num;
        // int count=0;
        // while(temp_num>0)
        // {
        //     count++;
        //     temp_num/=10;
        // }
        // System.out.println("enter the rotation");
        // int rotate=sc.nextInt();
        // int i=1;
        // while(i<=rotate)
        // {
        //     int b=num%10;
        //     num=num+b*(int)Math.pow(10,count);
        //     num=num/10;

        //     System.out.println("row "+i+"="+num);
        //     i++;
        // }
         
        // -------------------------second methord----------------------------------


        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rot=sc.nextInt();//-2;
        int count=0;
        int num_1=num;
        while(num_1>0)
        {
            count++;
            num_1/=10;
        }
        rot=rot%count; 
        if(rot<0)
        {
            rot=count+rot;
        }

        int first=num%(int)(Math.pow(10,rot));
        int second=num/(int)(Math.pow(10,rot));
        int temp=second;
         count=0;
        while(temp>0)
        {
            count++;
            temp/=10;
        }
       
        num=first*(int)Math.pow(10,count)+second;
        System.out.println(num);


        sc.close();
    }
     
}
