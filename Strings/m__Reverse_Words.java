import java.util.Scanner;

public class m__Reverse_Words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        String str=sc.nextLine();

        String [] arr=str.split(" ");

        String rev="";
        for(int i=0;i<arr.length;i++)
        {
            rev=arr[i]+" "+ rev;
        }
        System.out.println(rev);

       


        sc.close();
    }
    
}
