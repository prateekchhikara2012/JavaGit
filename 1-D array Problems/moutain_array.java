public class moutain_array {

        //striclty increasing , decrasing , increasing than decreasing
        public static void main(String[] args) {
            int arr[]={9,6,4,3,2,1};
            boolean abc=check(arr);
            System.out.println(abc);
    
        }
        public static boolean check(int [] arr)
        {
            int i=0;
            for(i=0;i<arr.length-1;i++)
            {
                if(arr[i]<arr[i+1]);
                else
                break;
            }

            // for striclty increasing than decreasing uncomment these lines

            // if(i==0 || i==arr.length-1)
            // {
            //     System.out.println("strivtly incresing ya decreasing");
            //     return false;
            // }
            

            for(int j=arr.length-1;j>i;j--)
            {
                if(arr[j]<arr[j-1]);
                else
                {
                    return false;
                }
            }
            return true;
        }
    
        
    }
    
    

