public class inverseusingaarraym_1 {
    public static void main(String[] args) {
        int a[]={2,4,3,1,0};
        int []b=new int [a.length];


        int num=0;
        for(int i=0;i<a.length;i++)
        {
            num=a[i];
            b[num]=i;


            /* second methord
            if you dont want a variable

               b[num[i]]=i;

               
             */
        }

         
        for(int i:b)
        {
            System.out.println(i);
        }
    }
    
}
