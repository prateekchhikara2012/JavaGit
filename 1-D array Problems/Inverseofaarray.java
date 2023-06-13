import java.util.Scanner;

public class Inverseofaarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr= new int [n];
        int []arr_new=new int [n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
            int temp=arr[i];
            arr_new[temp]=i;
        }
        System.out.println();
        for(int i:arr_new)
        {
            System.out.print(i+" ");
        }
        sc.close();
    }
    
}
