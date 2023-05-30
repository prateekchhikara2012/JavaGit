import java.util.Scanner;
public class linearsearch
{
    //if found than return the array index else return -1
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int arr[]={20,30,80,560,340,23,70,90};

        System.out.println("enter the number that you want to search ");
        int num=sc.nextInt();//no


        int i=find(arr,num);
        System.out.println("index is "+i);
    }
    public static int find(int [] arr,int num)
    {


        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                return i;
            }
        }

       return -1;

    }

}