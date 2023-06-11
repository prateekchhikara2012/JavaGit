public class Maximum_Sum_Path_in_Two_Arrays {
    public static void main(String[] args) {
        int a[]={2,3,7,8,11,12,15,16,20};
        int b[]={1,5,7,9,10,15,30,34};
        // int a[]={2, 3, 7, 10, 12, 15, 30, 34};
        // int b[]={1, 5, 7, 8, 10, 15, 16, 19};

        int i=0,j=0,a_length=a.length,b_length=b.length;

        int b_sum=0,a_sum=0,max_sum=0;

        
        while(i<a.length && j<b.length)
        {
            if(a[i]>b[j])
            {
                b_sum=b_sum+b[j];
                j++;
            }
            else if(a[i]<b[j])
            {
                a_sum=a_sum+a[i];
                i++;
            }
            else
            {
                max_sum=max_sum+Math.max(a_sum, b_sum)+a[i];

                a_sum=0;
                b_sum=0;
                i++;
                j++;
            }

        }
        
       
        while(i<a_length)
        {
            a_sum=a_sum+a[i];
            i++;
        }

        while(j<b_length)
        {
            b_sum=b_sum+b[j];
            j++;
        }
      
        max_sum=max_sum+Math.max(a_sum, b_sum);
       
        System.out.println(max_sum);
    }
    
}
