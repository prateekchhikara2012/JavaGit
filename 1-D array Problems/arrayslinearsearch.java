import java.util.Scanner;
//  If M is found in the Array the index of M is returned else -1 
//  is returned and print the value returned.

public class arrayslinearsearch {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        int num=sc.nextInt();

        int [] arr=new int[num];


        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int m=sc.nextInt();// for finding the number

        int res=finding(arr,m);



        System.out.println("array index is " + res);


    }

    public static int finding(int [] arr ,int m)
    {

        for(int i=0;i<arr.length;i++)
        {
            if(m==arr[i])
            {
                return i;
            }
        }

        return -1;
    }
    
}
