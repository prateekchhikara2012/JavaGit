import java.util.Scanner;

public class arraydemo
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int arr[]=takeinput();
        display(arr);
    }
    public static int[] takeinput()
    {
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void display(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}