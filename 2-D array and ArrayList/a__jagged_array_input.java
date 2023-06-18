import java.util.*;

//jagged array taking input and displaying using enhanced loop
public class a__jagged_array_input{
    public static void main(String[] args) {
        System.out.println("enter the rows");
        Scanner sc=new Scanner(System.in);
        int arr[][] =new int[sc.nextInt()][];

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("enter the colums for "+ i + "row");
            arr[i]=new int [sc.nextInt()];

            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("enter the elements for "+i+" and " + j);
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("for printing");

        for(int [] val:arr)
        {
            for(int i:val)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        sc.close();
    }

    
}
