public class b__wave_display_jagged {
    public static void main(String[] args) {

        int arr[] []={{1,2,3,4},{5,6},{7,8,9},{10,11,12,13,14},{15,16},{17,18,19}};
        for(int col=0;col<5;col++)
        {
            if(col%2==0)
            {
              
                int row=0;
                while(row<arr.length)
                {
                    if(col<arr[row].length)
                    {
                        System.out.print(arr[row][col]+ " ");
                    }
                    row++;
                }
            }
            else
            {
                
                int row=arr.length-1;

                while(row>=0)
                {
                    if(col<arr[row].length)
                    {
                        System.out.print(arr[row][col]+" ");
                    }
                    row--;
                }


            }
            

        }
    }
    
}
