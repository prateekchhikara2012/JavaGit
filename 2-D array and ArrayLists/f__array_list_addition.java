import java.util.ArrayList;

public class f__array_list_addition {
    public static void main(String[] args) {
        
        int a[]={5,9,8,7,5};
        int b[]={9,6,7};
        
        int i=a.length-1;
        int j=b.length-1;

        ArrayList <Integer> list=new ArrayList<Integer>();
        int carry=0;

        while(i>=0 || j >=0)
        {
            int sum=carry;

            if(i>=0)
            {
                sum=sum+a[i];
            }
            if(j>=0)
            {
                sum=sum+b[j];
            }

            //sum=14;
            int num=sum%10;
            list.add(0,num);

            carry=sum/10;

            i--;
            j--;

        }
        if(carry>0)
        list.add(0,carry);

        System.out.println(list);
    }
    
}
