public class sortinginteger {
    public static void main(String[] args) {
        int a=31524;

        int num=a;
        int min=Integer.MAX_VALUE;

        int i=1;
        int count = 5;
        int check=0;
        int sum=0;

        for(int j=1;j<=5;j++)
        {
            num=a;
            min=Integer.MAX_VALUE;
            while(num>0)
            {
                int mod= num%10;
                if(mod<min && mod>check)
                {
                    min=mod;//min==1;
                }
                num=num/10;
            }
    

            sum=sum+min*(int)(Math.pow(10,count-i));//i=1
            check=min;
            i++;


        }
        System.out.println(sum);

    }
    
}
