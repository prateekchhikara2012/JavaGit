public class g__time_complexity_polynomial {
    public static void main(String[] args) {
        int x=3;
        int n=7;
        int j=n,i=1;

       int  i_prod=1;
       int sum=0;
        while(j>=1 && i<=7)
        {
            i_prod=i_prod*x;


           sum=sum+(i_prod*j);

            j--;
            i++;
        }
        System.out.println(sum);
    }
    
}
