import java.util.Scanner;
//finding out value and creating a new array of that array
public class samevaluecreatingarray {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,20,550,45,20,45,20};
        System.out.println("enter the number that you want to create a new array");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        check(arr,num);

        sc.close();
    }
    public static void check(int [] arr,int num)
    {
        int count=0;
        for(int i:arr)
        {
            if(num==i)
            {
                count++;
            }
        }

        int abc[] =new int[count];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(num==arr[i])
            {
                abc[j]=i;
                j++;
            }

        }
        for(int i:abc)
        {
            System.out.println(i);
        }
    }
    
}
