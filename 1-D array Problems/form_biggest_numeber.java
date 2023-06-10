import java.util.Scanner;

public class form_biggest_numeber {

    static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        

       
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            check();
        }


    }
    public static void check()
    {
        int tot=sc.nextInt();
        int arr[]=new int [tot];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
                
            for(int j=i+1;j<arr.length;j++)
            {


                int count_1=0;
                int num=arr[i];
                while(num>0)
                {
                    count_1++;
                    num=num/10;
                }


                int count_2=0;
                num=arr[j];
                while(num>0)
                {
                    count_2++;
                    num=num/10;
                }

                Long sum_1=arr[i]*(long) (Math.pow(10,count_2) +arr[j] );
                // or you can write 
                // String sum_1=arr[i]+""+arr[j];
                

                Long sum_2=arr[j]*(long)(Math.pow(10,count_1)+arr[i]);
                // or you can write 
                // String sum_1=arr[j]+""+arr[i];

                if(sum_1<sum_2)
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }


        }
        for(int i:arr)
        {
            System.out.print(i);
        }
        System.out.println();
    }


}

