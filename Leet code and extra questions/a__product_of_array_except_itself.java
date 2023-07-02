public class a__product_of_array_except_itself {
    public static void main(String[] args) {
        //leet code
        // https://leetcode.com/problems/product-of-array-except-self/

        int arr[]={3,2,4,5};
       // n_complexity(arr);
        n_complexity_less_space(arr);
        
    }
    public static void n_complexity(int arr[])
    {
        int left[]=new int [arr.length];
        int right[]=new int [arr.length];


        left[0]=1;
        right[right.length-1]=1;

        for(int i=1;i<left.length;i++)
        {
            left[i]=left[i-1]*arr[i-1];
        }

        for( int i=right.length-2;i>=0;i--)
        {
            right[i]=right[i+1]*arr[i+1];
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(right[i]*left[i]+" ");
        }
    }
    
    public static void n_complexity_less_space(int arr[])
    {
        int left[]= new int [arr.length];

        left[0]=1;

        for(int i=1;i<left.length;i++)
        {
            left[i]=arr[i-1]*left[i-1];
        }

        int r=5;
        for(int i=left.length-2;i>=0;i--)
        {

            left[i]=left[i]*r;
            r=r*arr[i];
        }

        for(int i:left)
        {
            System.out.print(i+" ");
        }
    }
    
}

    

